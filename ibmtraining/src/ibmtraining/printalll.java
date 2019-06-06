package ibmtraining;

import java.io.File;

public class printalll {

	public static void main(String[] args) {
		File f1= new File("D:\\Rb");
		System.out.println("isdirectory  :"+ f1.isDirectory());
		if(f1.isDirectory())
		{
			String arr[]=f1.list();
			
			for(String s: arr)
				System.out.println(s);
		}

	}

}
