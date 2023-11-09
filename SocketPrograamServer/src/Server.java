import com.sun.source.tree.WhileLoopTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.net.*;
public class Server {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(9999);
        Socket s = ss.accept();
        System.out.println("Client Connected");
        while(true) {
            InputStreamReader in = new InputStreamReader(s.getInputStream());
            BufferedReader bf = new BufferedReader(in);
            String str = bf.readLine();
            System.out.println("Client : " + str);

            PrintWriter a = new PrintWriter(s.getOutputStream());
            a.println(sc.nextLine());
            //System.out.println(a.flush());
            a.flush();
        }

    }
}
