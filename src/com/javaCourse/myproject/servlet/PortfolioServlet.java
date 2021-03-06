package com.javaCourse.myproject.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaCourse.myproject.model.*;
import com.javaCourse.myproject.service.PortfolioManager;
/**
 * 
 * this class creates place in the system to portfolio manager and to portfolio.
 * this class gets data from portfolio manager and add him to portfolio. 
 *
 */

public class PortfolioServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PortfolioManager portfolioManager = new PortfolioManager();
		Portfolio portfolio1 = portfolioManager.getProfolio();
		Portfolio portfolio2 = new Portfolio(portfolio1);
		portfolio2.setTitle("Portfolio #2");
		resp.getWriter().println(portfolio1.getHtmlString());
		resp.getWriter().println("<br>");
		resp.getWriter().println(portfolio2.getHtmlString());
		portfolio1.removeStock(portfolio1.getStocks());
		resp.getWriter().println(portfolio1.getHtmlString());
		resp.getWriter().println("<br>");
		resp.getWriter().println(portfolio2.getHtmlString());
		portfolio2.changeLastStocksBid(55.55f,portfolio1.getStocks());
		resp.getWriter().println(portfolio1.getHtmlString());
		resp.getWriter().println("<br>");
		resp.getWriter().println(portfolio2.getHtmlString());
	}
	
}
