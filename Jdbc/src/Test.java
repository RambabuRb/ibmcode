import java.security.interfaces.RSAKey;
import java.sql.*;
import javax.sql.*;
public class Test {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="hr";
		String password="hr";
		Connection conn=DriverManager.getConnection(url, user, password);
		Statement stmt=conn.createStatement();
		String qq="SELECT * FROM employees";
		//String in="INSERT INTO employees(employee_id,last_name,email,hire_date,job_id) VALUES(917,'foster','sunaiyan@.com',17-may=1998,'sh-cleark')";
		
		int empid;
		String firstname;
		String lastname;
		String email;
		String phno;
		Date date;
		String jobid;
		int sal;
		int commp;
		int manaid;
		int deptid;
        stmt.executeUpdate(qq);
		ResultSet re=stmt.executeQuery(qq);
		
		
		while(re.next())
		{
			empid=re.getInt("EMPLOYEE_ID");
			firstname=re.getString("FIRST_NAME");
			lastname=re.getString("LAST_NAME");
			email=re.getString("EMAIL");
			phno=re.getString("PHONE_NUMBER");
			date=re.getDate("HIRE_DATE");
			jobid=re.getString("JOB_ID");
			sal=re.getInt("SALARY");
			commp=re.getInt("COMMISSION_PCT");
			manaid=re.getInt("MANAGER_ID");
			deptid=re.getInt("DEPARTMENT_ID");
			System.out.println(empid +"   "+ firstname +"    "+  lastname +"    "+email+ "    " +phno+"    "+date+"    " +jobid+"    "+sal+"     "+manaid+"    "+commp+"    "+deptid);
		
			
					}
		System.out.println("succcess!!!!..");

	}

}
