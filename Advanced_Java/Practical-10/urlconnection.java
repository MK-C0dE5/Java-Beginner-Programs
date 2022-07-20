import java.io.*;
import java.net.*;
public class urlconnection{
	public static void main(String[] args){
		try{
			URL url= new URL("http://127.0.0.1:9001/urlclass");
			URLConnection urlcon = url.openConnection();
			InputStream stream = urlcon.getInputStream();

			int b;
			while((b = stream.read()) != -1){
				System.out.println((char)b);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
