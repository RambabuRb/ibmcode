package trainingJbdc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="hr";
		String password="hr";
		Connection conn=DriverManager.getConnection(url,user,password);
		
		Statement stmt=conn.createStatement();
		String q="INSERT INTO  EMPLOYEES(employee_id,last_name,email,hire_date,job_id)\r\n"
				+ " VALUES(3422,'abi','ewfwgfeqrgq@gmail.com','12-may-19','SH_CLERK')";
		
		stmt.executeUpdate(q);
		conn.close();
		System.out.println("Successfully...............");
		
	}
}
