import java.net.*;
import java.utils;

class serversock{
    public static void main(String[] args) {
        Socket s = new Socket("localhost", 1212);
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF("Hello server");
        dout.flush();
        dout.close();
        s.close();
        
    }
}