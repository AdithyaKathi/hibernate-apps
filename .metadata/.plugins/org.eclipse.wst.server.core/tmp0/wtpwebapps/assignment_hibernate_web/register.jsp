<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.abc.pack.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="ob" class="com.abc.pack.Product"></jsp:useBean>
<jsp:setProperty property="*" name="ob" />

<%

int i = ProductDAO.register(ob);
if(i>0) out.println("Successfully Entered");

%>

</body>
</html>