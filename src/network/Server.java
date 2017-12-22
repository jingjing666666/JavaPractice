package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by yuanqingjing on 2017/12/23
 */
public class Server {
    public static void main(String[] args) {
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
