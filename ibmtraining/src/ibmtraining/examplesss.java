package ibmtraining;

 class examplesss {
	class super3{

		int i=10;

		public super3(int num){

		i=num;

		}

		}

		public class Inherite1 extends super3{

		public Inherite1(int a){

		super(a);

		}

		public void Exe(){

		System.out.println(i);

		}

		public static void main(String[]args){

		Inherite1 o=new Inherite1(50);

		super3 s=new Inherite1(20);

		System.out.println(s.i);

		o.Exe();

		}

		}

}		 

