<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="com.mypack.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<jsp:useBean id="ob" class="com.mypack.Employee1"></jsp:useBean>

<jsp:setProperty property="*" name="ob" />

<%

int i = Employee1DAO.register(ob);
if(i>0) out.println("You Are Successfully Registered");

%>
</body>
</html>