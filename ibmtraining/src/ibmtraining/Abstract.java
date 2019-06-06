package ibmtraining;

public class Abstract {
		public static void main(String[] args) {	
			
	       // Shapes1 sh; 
			Rectangle1 r1= new Rectangle1(19,332);
			Rectangle1 r2= new Rectangle1(19,332);
			Circle c1=new Circle(15);
			Circle c2=new Circle(22);
			
		 Shapes1[] shapesA= new Shapes1[4];

		 shapesA[0]=r2;
		 shapesA[1]=r1;
		 shapesA[2]=c2;
		 shapesA[3]=c1;
			System.out.println("-----------------------------------");
		//sh.display();
			process(shapesA);
		
		
	}	
		
			
		

	   static void process(Shapes1[] sarray)
	   {
		   for(int i=0;i<sarray.length;i++)
		   {
			   sarray[i].display();
		   }
	   }
	}
		interface Shapes1
		{
	
			
			abstract public void display();
		 
		
		}
		 class Rectangle1 implements Shapes1
		{
				double length;
				double breadth;
			public Rectangle1(double a,double b)
			{
				length=a;
				breadth=b;
			}
			double area;
			public void display()
			{
				 area=length*breadth;
				System.out.println(area);
			}
		

	}
		 class Circle implements Shapes1
		{
			 double radius;
		public Circle(double c)
		{
			radius=c;
		}
		double area;
		
		public void display()
		{
			 area=radius*radius;
			System.out.println(area);
		}
	

}


