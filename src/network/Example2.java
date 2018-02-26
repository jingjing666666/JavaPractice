package network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by jingjing on 2017/12/22.
 */
public class Example2 {
    public static void client(){
        try {
            Socket clientSocket = new Socket("192.168.31.145",8888);
            PrintWriter printWriter = new PrintWriter(clientSocket.getOutputStream());
            String str="client Love server";
            printWriter.print(str);
            printWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static  void server(){
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            Socket client = serverSocket.accept();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String line = bufferedReader.readLine();
            System.out.println(line);
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        client();
    }

}
