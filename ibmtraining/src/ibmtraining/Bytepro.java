package ibmtraining;
import java.io.*;
public class Bytepro {

	public static void main(String[] args) throws Exception{
		FileInputStream f1= new FileInputStream("D:\\javawork\\ibmtraining\\src\\ibmtraining\\Bytepro.java");
		int b=f1.read();
	/* while( b!=-1)
		 {
			 System.out.print((char) b);
			 b=f1.read();
;
		 }*/
		 while(f1.available()>0)
		 {
			 System.out.print((char) b);
			 b=f1.read();

		 }
		   
		 f1.close();
		
		
	}

}
