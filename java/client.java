import java.io.*;
import java.net.*;

class client {

    public static void main(String[] args) {

        try {

            Socket s = new Socket("localhost", 5000);

            PrintWriter out =
                    new PrintWriter(s.getOutputStream(), true);

            out.println("Hello Server");

            BufferedReader br =
                    new BufferedReader(
                            new InputStreamReader(s.getInputStream()));

            System.out.println("Server Message: " + br.readLine());

            s.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}