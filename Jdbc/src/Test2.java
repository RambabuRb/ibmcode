import java.sql.*;
import javax.sql.*;
public class Test2 {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="hr";
		String password="hr";
		Connection conn=DriverManager.getConnection(url, user, password);
		Statement stmt=conn.createStatement();
	
		String in="delete from employees where EMPLOYEE_ID=117 ";
		stmt.executeUpdate(in);
		conn.close();
		
		System.out.println("success!!!!");
	}
}