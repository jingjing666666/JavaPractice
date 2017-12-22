package network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by yuanqingjing on 2017/12/23
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("192.168.31.145",8888);
            PrintWriter printWriter = new PrintWriter(clientSocket.getOutputStream());
            String str="client Love server";
            printWriter.print(str);
            printWriter.flush();
            clientSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
