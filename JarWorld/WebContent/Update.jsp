<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.sql.*,java.util.*"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="">
Enter Employee Id<input type="text" name="eid"><br/>
<h1>Updated field</h1><br/>
Salary<input type="text"  name="sal" ><br/>
phone_number<input type="text" name="ph"><br/>
<input type="submit">
</form>
<%! String driverName = "oracle.jdbc.OracleDriver";%>
<%!String url = "jdbc:oracle:thin:@localhost:1521:xe";%>
<%!String user = "hr";%>
<%!String psw = "hr";%>
<%
String lid=request.getParameter("eid");
//int id=Integer.parseInt(lid);
String ln=request.getParameter("sal");
String en=request.getParameter("ph"); 
if(lid!=null){
	try{

				Connection conn=DriverManager.getConnection(url,user,psw);

String sql="Update employees set salary=?,phone_number=? where employee_id="+lid;

PreparedStatement ps = conn.prepareStatement(sql);
ps.setString(1, ln);
ps.setString(2, en);
ps.executeUpdate();
conn.close();
out.print("Record Updated Successfully");
}
	catch(SQLException sql)
	{
	
	out.println(sql);
	}
}
%>
</body>
</html>