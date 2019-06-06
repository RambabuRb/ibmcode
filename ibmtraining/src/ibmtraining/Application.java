package ibmtraining;

public class Application {

	public static void main(String[] args) {	
		

		Rectangle r1= new Rectangle(19,332);
		Rectangle r2= new Rectangle(19,332);
		
		
	 Shapes[] shapesA= new Shapes[2];

	 shapesA[0]=r2;
	 shapesA[1]=r1;
		System.out.println("-----------------------------------");
	//sh.display();
		process(shapesA);
	
	
}	
	
		
	

   static void process(Shapes[] sarray)
   {
	   for(int i=0;i<sarray.length;i++)
	   {
		   sarray[i].display();
	   }
   }
}
	class Shapes
	{
		double length;
		double breadth;
		int radius;
		void display()
		{
			
			System.out.println("area");
		}
	
	}
	 class Rectangle extends Shapes
	{

		public Rectangle(double a,double b)
		{
			length=a;
			breadth=b;
		}
		double area;
		void display()
		{
			 area=length*breadth;
			System.out.println(area);
		}
	

}
