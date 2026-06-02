import java.io.*;
import java.net.*;

class p35 {

    public static void main(String[] args) {

        try {

            ServerSocket ss = new ServerSocket(5000);

            System.out.println("Server Waiting...");

            Socket s = ss.accept();

            System.out.println("Client Connected");

            BufferedReader br =
                    new BufferedReader(
                            new InputStreamReader(s.getInputStream()));

            String msg = br.readLine();

            System.out.println("Client Message: " + msg);

            PrintWriter out =
                    new PrintWriter(s.getOutputStream(), true);

            out.println("Hello Client");

            ss.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}