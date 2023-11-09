import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.net.*;
public class Client {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",9999);
        while(true) {
            PrintWriter a = new PrintWriter(s.getOutputStream());
            a.println(sc.nextLine());
            //System.out.println(a.flush());
            a.flush();

            InputStreamReader in = new InputStreamReader(s.getInputStream());
            BufferedReader bf = new BufferedReader(in);
            String str = bf.readLine();
            System.out.println("Server : " + str);
        }
    }
}