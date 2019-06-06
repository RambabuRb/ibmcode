
public class Application {
	public static void name(String[] args) {
		
		

		Rectangle r1=new Rectangle(155,33);
		Rectangle r2=new Rectangle(19,33);
		
		
	 Shapes[] shapesA= new Shapes[2];

	 shapesA[0]=r2;
	 shapesA[1]=r1;
		System.out.println("-----------------------------------");
	
		process(shapesA);
	
	
}	
	
		
	

   static void process(Shapes[] sarray)
   {
	   for(int i=0;i<sarray.length;i++)
	   {
		   sarray[i].display();
	   }
   }
	class Shapes
	{
		int length;
		int breadth;
		int radius;
		void display()
		{
			
			System.out.println("area");
		}
	
	}
	class Rectangle extends Shapes
	{
		public Rectangle(int i, int j) {
			// TODO Auto-generated constructor stub
		}
		public void Rectangle(int a,int b)
		{
			length=a;
			breadth=b;
		}
		int area=length*breadth;
		void display()
		{
			
			System.out.println(area);
		}
	}
	}
	