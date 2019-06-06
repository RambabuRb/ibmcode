package ibmtraining;

import java.io.*;;

public class Readfun {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("D:\\javawork\\ibmtraining\\src\\ibmtraining\\Readfun.java");
		BufferedReader bufferreader= new BufferedReader(fr);
		String s=bufferreader.readLine();
		while(s!=null)
		{
			System.out.println(s);
			s=bufferreader.readLine();
		}

	}

}
