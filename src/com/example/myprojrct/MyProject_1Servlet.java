package com.example.myprojrct;

import java.io.IOException;

import javax.servlet.http.*;


@SuppressWarnings("serial")
public class MyProject_1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		
		resp.getWriter().println("Hello World");
		
	}
}
