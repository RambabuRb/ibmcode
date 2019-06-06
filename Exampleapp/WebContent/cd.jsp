<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String books[];%>
<%
   books = request.getParameterValues("book");
ServletContext con = getServletContext();
con.setAttribute("BOOK1", books);
%>

<form action="gift.jsp">
<input type="checkbox" name="book">tamil<br><br>
<input type="checkbox" name="book">hindi<br><br>
<input type="checkbox" name="book">english<br><br>
<input type="checkbox" name="book">all<br><br>
<!-- <input type="submit" name="NEXT" >NEXT -->
<button type="submit">NEXT</button>
</form>

</body>
</html>