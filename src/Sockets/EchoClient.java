package Sockets;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {

    public static void main(String[] Args) {
        try {
            System.out.println("Requesting for connection...");
            Socket soc = new Socket("localhost", 1106);// forming a socket object to communicate wit the server at port given port

            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));//Reading the users input from his/her keyboard
            System.out.println("Send your message to the server here:..");
            String message = input.readLine();

            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println(message);

            BufferedReader socIn = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String res = socIn.readLine();
            System.out.println(res);




           // BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}