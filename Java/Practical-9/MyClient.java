import java.io.*;
import java.net.*;
 
class MyClient {
    public static void main(String[] args)
    {
        try {
            Socket socket = new Socket("localhost", 4444);
            System.out.println("Connected Successfully.....");
 
            BufferedReader bs = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Response from Server.....");
 
            System.out.println("Client Side : " + bs.readLine());
            socket.close();
        }
        catch (UnknownHostException e) {
            System.out.println("IP not found for" + e);
        }
        catch (IOException e) {
            System.out.println("Not found data for socket" + e);
        }
    }
}
