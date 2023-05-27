package Sockets2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] Args){
        try{
            System.out.println("CLient started...");
            Socket soc = new Socket("localhost",8808);
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter messsage");
            String message = input.readLine();


            //Binding the User message to the socket
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println(message);

            BufferedReader socIn = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String res = socIn.readLine();
            System.out.println(res);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
