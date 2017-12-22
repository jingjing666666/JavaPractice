package network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by jingjing on 2017/12/22.
 */
public class Example2 {
    public void client(){
        try {
            Socket clientSocket = new Socket("192.168.3.23",8888);
            PrintWriter printWriter = new PrintWriter(clientSocket.getOutputStream());
            String str="client Love server";

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  void server(){
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


}
