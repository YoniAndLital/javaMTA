package com.example.myprojrct;

import java.io.IOException;

import javax.servlet.http.*;


@SuppressWarnings("serial")
public class Exerice3 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		
		double radius=50;
		double angle=30;
		double hypotenuse=50;
		int base=20;
		int exp=13;
		
		Calculator.calcCircle(radius);
		Calculator.setValues(radius, angle, exp, base);
		Calculator.findTriangleOpposite(angle, hypotenuse);
		Calculator.power(base, exp);
		String answers=Calculator.getResults();
		resp.getWriter().println(""+answers+"");
		
	}
}
