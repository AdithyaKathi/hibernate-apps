<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.abc.mypack.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hibernate Web Project</title>
</head>
<body>


   <jsp:useBean id="ob" class="com.abc.mypack.User"></jsp:useBean>
   
   
   <jsp:setProperty property="*" name="ob"/>
   
   <%
   int i = UserDAO.register(ob);
   if(i>0) out.print("You Are Successfully Registered");
   
   %>
</body>
</html>