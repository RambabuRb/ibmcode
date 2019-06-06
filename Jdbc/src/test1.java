import java.sql.*;
import javax.sql.*;
public class test1 {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="hr";
		String password="hr";
		Connection conn=DriverManager.getConnection(url, user, password);
		Statement stmt=conn.createStatement();
	
		String in="INSERT INTO employees(employee_id, last_name, email, hire_date, job_id) VALUES(617,'FOSTER', 'fsaf@gmail.com', '17-may-18', 'SH_CLERK')";
		stmt.executeUpdate(in);
		conn.close();
		
		System.out.println("success!!!!");
	}
}