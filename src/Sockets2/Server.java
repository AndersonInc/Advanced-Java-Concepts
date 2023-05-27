package Sockets2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] Args){
        try {
            System.out.println("Waiting for incoming client connection....");
            ServerSocket ss = new ServerSocket(8808);
            Socket soc = ss.accept();
            System.out.println("Connected successfully");

            //reading from the client socket
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String req = in.readLine();

            //sending the response back to the client
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println("Server says: "+req);



        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
