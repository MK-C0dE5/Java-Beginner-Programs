import java.io.*;
import java.net.*;

public class InetAddress1{
	public static void main(String[] args){
		try{
			InetAddress ip = InetAddress.getByName("en.wikipedia.org");
			System.out.println("Host name: "+ip.getHostName());
			System.out.println("IP Address: "+ip.getHostAddress());
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
			
