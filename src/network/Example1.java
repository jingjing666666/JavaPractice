package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by jingjing on 2017/12/22.
 */
public class Example1 {
    public static void main(String[] args) {

        try {
            InetAddress inetAddress =InetAddress.getByName("www.baidu.com");
            InetAddress inetAddress1 = InetAddress.getLocalHost();
            String host ="180.97.33.108";
            byte [] bytes = host.getBytes();
            System.out.println(bytes);
//            InetAddress inetAddress2 = InetAddress.getByAddress(bytes);
            System.out.println(inetAddress.getHostAddress());
//           System.out.println(inetAddress2.getHostAddress());
            System.out.println(inetAddress1);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
