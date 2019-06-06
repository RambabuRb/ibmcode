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

<sql:setDataSource 
   var="dbconnection" user="hr" password="hr"
  driver="oracle.jdbc.OracleDriver" url="jdbc:oracle:thin:@Localhost:1521:xe"/>

<sql:query dataSource="${dbconnection}" var="rs">
SELECT * FROM employees
</sql:query>

<table border="1">
<c:forEach var="row" items="${rs.rows}">
<tr>
   <td><c:out value="${row.employee_id}"/>
   <td><c:out value="${row.first_name}"/>
   <td><c:out value="${row.last_name}"/>
   <td><c:out value="${row.email}"/>
   <td><c:out value="${row.phone_number}"/>
   <td><c:out value="${row.hire_date}"/>
  <td><c:out value="${row.salary}"/>
   <td><c:out value="${row.job_id}"/>
  </tr> 
  </c:forEach>
  </table>
</body>
</html>