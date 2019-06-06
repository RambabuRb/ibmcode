package ibmtraining;

import java.io.*;

public class deserial {
 public static void main(String[] args) throws Exception {
	 FileInputStream f1=new FileInputStream("D:\\javawork\\rr.txt");
		ObjectInputStream cos=new ObjectInputStream(f1);
		 Object oo=cos.readObject();
		System.out.println("create Deseriable"+ oo);
}
}
