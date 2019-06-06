package ibmtraining;
import java.io.*;
public class Datainput1 {
	public static void main(String[] args) throws Exception {
		byte b=1;
		short s=28;
		double d=1000;
		FileOutputStream fos=new FileOutputStream("D:\\javawork\\data21.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		
		dos.writeByte(b);
		dos.writeShort(s);
		dos.writeDouble(d);
		dos.close();
		fos.close();
		System.out.println("data written");
	}
}
