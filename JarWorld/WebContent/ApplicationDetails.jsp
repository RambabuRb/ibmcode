<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="">
 	ADMIN_ID<input type="text" name="user" ><br/>
 PASSWORD<input type="text" name="pass" ><br/>
 <input type="submit">
</form>


<% String s=request.getParameter("user"); 
    String p=request.getParameter("pass");
    if(s!=null && p!=null){
    if(s.equals("rb")&&p.equals("sri"))
    {
    %>    
    MAtched
   <jsp:forward page="AdminPage.jsp"/>
<%
}
    else    {
    %>
failed!!
<%
} 
    }
%>
</body>
</html>