package com.adhits.pack1;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
import java.sql.*;

@WebServlet(urlPatterns="/entry")
public class Client extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		RequestDispatcher rd = request.getRequestDispatcher("success.html");
		RequestDispatcher rd2 = request.getRequestDispatcher("book.html");
		
		String name , country , mobile ,email , company , web , job , aboutus , help;
		
		name = request.getParameter("name");
		country = request.getParameter("country");
		mobile = request.getParameter("mobile");
		email = request.getParameter("email");
		company = request.getParameter("company");
		web = request.getParameter("web");
		job = request.getParameter("job");
		aboutus = request.getParameter("aboutus");
		help = request.getParameter("help");
		
		HttpSession session = request.getSession();
		session.setAttribute("n",name);
		
		try {
			String url = "jdbc:postgresql://localhost:5433/demo";
	        String uname = "postgres";
	        String pass = "0000";
	        
	        Class.forName("org.postgresql.Driver");
	        Connection con = DriverManager.getConnection(url,uname,pass);
	        Statement stmt = con.createStatement();
	        String query = "insert into client100(name,country,mobile,email,company,web,job,aboutus,help) values('"+name+"','"+country+"','"+mobile+"','"+email+"','"+company+"','"+web+"','"+job+"','"+aboutus+"','"+help+"')";
	        int k = stmt.executeUpdate(query);
	        
	        if(k > 0 ) {
	        	if(session != null) {
	        		pw.println("<h2>Hello Sir/Madam "+session.getAttribute("n").toString()+" , We'll Approach You Through Email & Whatsapp For Further Steps</h2><br>");
	        		session.invalidate();
	        	}else {
	        		pw.println("<h1>You Should Enter Correct Details!!</h1>");
	        		rd2.include(request, response);
	        		
	        	}
	        	pw.println("<br><p>Directly Contact Us Here <a aria-label=\"Chat on WhatsApp\" href=\"https://wa.me/918978322907?text=Hello%20There,%20we%20are%20Interested%20In%20Your%20Services\"> <img alt='Chat on WhatsApp' src='images\\whatsapp.png' width='40' height='40'/></a></p>");
	        	rd.include(request, response);
	        }
	        con.close();
	        
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
