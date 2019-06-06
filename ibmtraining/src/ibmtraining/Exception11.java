package ibmtraining;
import java.io.*;
import java.util.*;
public class Exception11 {
	public static void main(String args[])throws FileNotFoundException,IOException {
	Tesclass c1=new Tesclass();
	c1.Testmethod();
	}
}
	 
	class Tesclass{
		void Testmethod() throws FileNotFoundException,IOException
		{
			FileInputStream fls= new FileInputStream(" ");
			System.out.println("HELLO");
			fls.close();
		}
}

