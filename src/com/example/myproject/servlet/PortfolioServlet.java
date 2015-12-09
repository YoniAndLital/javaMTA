package com.example.myproject.servlet;
import com.example.myproject.service.*;
import com.example.myproject.model.*;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.myproject.model.Portfolio;
import com.example.myproject.service.PortfolioManager;
/**
 * 
 * this class creates place in the system to portfolio manager and to portfolio.
 * this class gets data from portfolio manager andd add him to portfolio. 
 *
 */
public class PortfolioServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PortfolioManager portfolioManager = new PortfolioManager();
		Portfolio portfolio1 = portfolioManager.getProfolio();
		//Portfolio portfolio2 = new Portfolio(portfolio1);
		Portfolio portfolio2 = new Portfolio();
		portfolio2.setTitle("Portfolio #2");
		
		resp.getWriter().println(portfolio1.getHtmlString());
		resp.getWriter().println("<br>");
		resp.getWriter().println(portfolio2.getHtmlString());
		
		
		resp.getWriter().println(portfolio1.getHtmlString());
		resp.getWriter().println("<br>");
		resp.getWriter().println(portfolio2.getHtmlString());
		
		
		resp.getWriter().println(portfolio1.getHtmlString());
		resp.getWriter().println("<br>");
		resp.getWriter().println(portfolio2.getHtmlString());
	}
}
