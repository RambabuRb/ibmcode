<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>summary</h1>
<%! String str[]; %>
ITEM YOU SELECTED <br>
<%
ServletContext con1 = getServletContext();
str = (String[])con1.getAttribute("BOOK1");
for(int i = 0; i < str.length; i++) {
out.println(str[i]);
}
%>
<br>
<%
str = (String[])con1.getAttribute("cd");
for(int i = 0; i < str.length; i++) {
out.println(str[i]);
}
%>
<br>
<%
str = (String[])con1.getAttribute("GIFT");
for(int i = 0; i < str.length; i++) {
out.println(str[i]);
}
%>
<br>
<%
str = (String[])con1.getAttribute("computers");
for(int i = 0; i < str.length; i++) {
out.println(str[i]);
}
%>
</body>
</html>