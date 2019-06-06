package ibmtraining;

import java.io.*;

public class Serial {

	public static void main(String[] args) throws Exception {
	Employee118 e1=new Employee118("11","Ram","cse","Engineer");
	FileOutputStream f1=new FileOutputStream("D:\\javawork\\rr.txt");
	ObjectOutputStream cos=new ObjectOutputStream(f1);
	cos.writeObject(e1);
	System.out.println("create seriable");
	
	}

}class Employee118 implements Serializable{
	String EmpId;
	String Empname;
	String Dept;
	transient String Desg;
	public Employee118(String EmpId,String Empname,String Dept,String Desg) {
		super();
		this.EmpId=EmpId;
		this.Empname=Empname;
		this.Dept=Dept;
		this.Desg=Desg;
	}
	
public String toString() {
	String s="\n  "+ EmpId+" "+  Empname +" "+ Dept +" "+ Desg;
	return s;
}
}