package ibmtraining;

public class Constructor {
	void display()
	{
		
		System.out.println("called"+id +name);
		
	}
	int id;
	String name;
	
	Constructor(){
		id=0;
		name="rbb";
		}
	Constructor(int id, String name){
		super();
		 this.id=id;
		this.name=name;
	}

	public static void main(String[] args) {
		Constructor c1=new Constructor();
		Constructor c2=new Constructor(12,"Ram");
		c1.display();
		c2.display(); 

	}

}
