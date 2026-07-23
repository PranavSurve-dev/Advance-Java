package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadHttpData extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Http run on console");
		
		String name = req.getParameter("username");
		String email = req.getParameter("useremail");
		
		System.out.println(name);
		System.out.println(email);
		
		resp.getWriter()
		.print("<html><body><h1>hello ,"+name+"!! welcome to http servlet</h1></body></html>");
	}
}
