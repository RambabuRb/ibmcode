import java.sql.*;
import javax.sql.*;
public class Test3 {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="hr";
		String password="hr";
		Connection conn=DriverManager.getConnection(url, user, password);
		String in="UPDATE employee SET salary=?, commission_pct=? WHERE employee_id=?";
		PreparedStatement st=conn.prepareStatement(in);
		st.setDouble(1, 50000.0);
		st.setDouble(2, 44);
		st.setInt(3, 118);
		
		st.executeUpdate();
		conn.close();
		
		System.out.println("success!!!!");
	}
}