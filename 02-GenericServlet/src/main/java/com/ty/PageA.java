package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/panu")
public class PageA extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
System.out.println("Hey, Good Afternoon");	

PrintWriter pw = res.getWriter();
 
pw.print("<html>"+"<body>"+"<h1>Hello from pranav</h1>"+"</body>"+"</html>");

	
	}

}
