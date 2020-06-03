package command;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Класс, передающий строку на страницу http:localhost:9087
 * @autor Svetlana Zolotareva
 */
public class UpPrintServer {
    /**поле ip - адрес*/
    static String ip = "localhost";
    /**Поле serverSocket*/
    static ServerSocket ss;


    public static void go(String str) throws Throwable {
        //System.err.println("Client accepted");
        ss = new ServerSocket(9087, 0, InetAddress.getByName(ip));
        new Thread(new SocketProcessor(str)).start();
    }

    private static class SocketProcessor implements Runnable {

        private Socket s;
        private InputStream is;
        private OutputStream os;
        private String str;

        private SocketProcessor(String str) throws Throwable {
            this.s = ss.accept();
            this.is = s.getInputStream();
            this.os = s.getOutputStream();
            this.str = str;
        }

        public void run() {
            try {
                readInputHeaders();
                writeResponse(str);
            } catch (Throwable t) {
            }
            //System.err.println("Client processing finished");
        }

        private void writeResponse(String s) throws Throwable {
            String response = "HTTP/1.1 200 OK\r\n" +
                    "Server: YarServer/2009-09-09\r\n" +
                    "Content-Type: text/html\r\n" +
                    "Content-Length: " + s.length()+ "\r\n" +
                    "Connection: open\r\n\r\n";

            String result = response + s;
            os.write(result.getBytes());
            os.flush();
            ss.close();
        }

        private void readInputHeaders() throws Throwable {
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            while(true) {
                String s = br.readLine();
                if(s == null || s.trim().length() == 0) {
                    break;
                }
            }
        }
    }
}
