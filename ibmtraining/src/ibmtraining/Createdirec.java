package ibmtraining;
import java.io.File;
import java.util.*;
public class Createdirec {

	public static void main(String[] args) {
		File f1= new File("D:\\javaworksexample");
		System.out.println("isdirectory  :"+ f1.isDirectory());
		if(!f1.isDirectory())
		{
			boolean dircreate=f1.mkdir();
			System.out.println("directory crated: "+ dircreate);
		}
		boolean deleteFolder=f1.delete();
		System.out.println("deleted  :"+deleteFolder);
	}

}
