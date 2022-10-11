import java.io.*;

public class input1{
    public static void main(String[] args) throws IOException{
        File primitive = new File("test.txt");
        FileOutputStream fos = new FileOutputStream(primitive);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(999);
        dos.writeDouble(123.456);
        dos.writeBoolean(false);
        dos.writeChar('A');
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream(primitive);
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readChar());
        dis.close();
        fis.close();
    }
}