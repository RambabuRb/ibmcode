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
 Employee_Id<input type="text" name="n"><br/>
 Last_Name<input type="text" name="l"><br/>
 Email<input type="text" name="e"><br/>
 Hire_Date<input type="text" name="d"></br>
 Job_id<select name="ji">
  <option value="AD_PRES" >AD_PRES </option>
  <option value="AD_VP">AD_VP</option>
  <option value="PU_CLERK ">PU_CLERK</option>
  <option value="IT_PROG">IT_PROG</option>
</select>
<input type="submit">
 </form>

  
<%
String id=request.getParameter("n"); 
String ln=request.getParameter("l");
String en=request.getParameter("e"); 
String hd=request.getParameter("d");
String jd=request.getParameter("ji");


 try
{
	Class.forName("oracle.jdbc.OracleDriver");
				String url="jdbc:oracle:thin:@localhost:1521:xe";
				String user="hr";
				String password="hr";
				Connection conn=DriverManager.getConnection(url,user,password);
Statement st=conn.createStatement();
int i=st.executeUpdate("insert into employees(employee_id,last_name,email,hire_date,job_id)values('"+id+"','"+ln+"','"+en+"','"+hd+"','"+jd+"')");
out.println("Data is successfully inserted!");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>
</body>
</html>