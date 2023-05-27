package Sockets;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

    public static void main(String[] Args){
        try {
            System.out.println("Waiting for incoming client connection request.......");
            ServerSocket ss = new ServerSocket(1106);
            Socket soc = ss.accept();
            System.out.println("Connection successfull.......");

            //reading input from th socket object
           BufferedReader input = new BufferedReader(new InputStreamReader(soc.getInputStream()));
           String userReg = input.readLine();
           //System.out.println("Client says: "+userReg);

            //sending the response back to the client
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println("Server says: "+userReg);





        }catch (Exception e){
            System.out.println("Caught an exception: "+e);
        }



    }
}