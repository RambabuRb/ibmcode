package ibmtraining;
import java.io.*;
public class Dataoutput1 {
	public static void main(String[] args) throws Exception{
		FileInputStream fos=new FileInputStream("D:\\javawork\\data1.txt");
		DataInputStream dos=new DataInputStream(fos);
		
		byte b= dos.readByte();
		short s=dos.readShort();
		
		dos.close();
		fos.close();
		System.out.println("byte "+ b);
		System.out.println("short "+ s);
	}

}
