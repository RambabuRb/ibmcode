package ibmtraining;
//import java.util.Scanner;

public class Parent {
	  public static void main( String args[]) {
			Demo obj = new Demo();
			obj.myMethod();
		   }
		   public void myMethod()
		   {
			System.out.println("Overridden method");
		   }	   
		}
		class Demo extends Parent{
		   public void myMethod(){
			//This will call the myMethod() of parent class
			super.myMethod();
			System.out.println("Overriding method");
		   }
		 
		}

	/*
	private static Scanner s;

	public static void main(String[] args) {
		
		 s = new Scanner(System.in);
		 String str= s.next();
		 System.out.println(str);
		 
	}

}
class paren
{
	public paren() {
     		
	}
}
class child extends paren
{
	public child(int i) {
          super();	
	}
}
	*/