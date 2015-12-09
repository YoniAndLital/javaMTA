package com.example.myproject.service;
import java.util.Calendar;
import com.example.myproject.model.*;
/**
 * 
 * this class add data to the porfolio class.
 *
 */
public class PortfolioManager {
	/**
	 * 
	 * this method add data to the stocks, and add the stock to portfolio stocks.
	 */
		public Portfolio getProfolio()
		{
			final int SIZE = 3;
			Portfolio portfolio = new Portfolio();
			Calendar c = Calendar.getInstance();
	        c.set(2014, 10, 15);
	        
	        Stock[] stocks=new Stock[SIZE];
	        
	        for(int i = 0 ; i < SIZE ; i++)
	        {
	        stocks[i] = new Stock();
	        }
			
	        stocks[0].setSymbol("PIH");
	        stocks[0].setAsk((float) 13.1);
	        stocks[0].setBid((float) 12.4);
	        stocks[0].setDate(c.getTime());
			portfolio.addStock(stocks[0]);
			stocks[1].setSymbol("AAL");
			stocks[1].setAsk((float) 5.78);
			stocks[1].setBid((float) 5.5);
			stocks[1].setDate(c.getTime());
			portfolio.addStock(stocks[1]);
			stocks[2].setSymbol("CAAS");
			stocks[2].setAsk((float) 32.2);
			stocks[2].setBid((float) 31.5);
			stocks[2].setDate(c.getTime());
			portfolio.addStock(stocks[2]);
			return portfolio;
			
		}
		
	}
