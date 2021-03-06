
package com.javaCourse.myproject.model;

import java.util.Calendar;

import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * this class contains all the stock's data and prints them to the screen. 
 *
 */
public class Stock {

	private int recommendation;
	private int stockQuantity;
	final static int BUY = 0;
	final static int SELL = 1;
	final static int REMOVE = 2;
	final static int HOLD = 3;
	private String symbol;
	private float ask;
	private float bid;
	private Date date;
	private SimpleDateFormat sdf;
	private Calendar c;
/**
 * this method is a constructor. 
 */
public Stock()
{
    date=new Date();
    c=Calendar.getInstance();

}
/**
 * this method is a copy constructor. 
 */
public Stock(Stock stock)
{
	this.symbol = stock.getSymbol();
	this.ask = stock.getAsk();
	this.bid = stock.getBid();
	this.date = stock.getDate();
	this.c=Calendar.getInstance();
	this.c.setTime(date);
}
public String getSymbol() {
	return symbol;
}
public void setSymbol(String symbol) {
	this.symbol = symbol;
}

	public float getAsk() {
		return ask;
	}
	public void setAsk(float ask) {
		this.ask = ask;
	}
	public float getBid() {
		return bid;
	}
	public void setBid(float bid) {
		this.bid = bid;
	}
		
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		sdf=new SimpleDateFormat("d/M/y");
		this.date=date;
	}
	/**
	 * this method print the stock's data to the screen.
	 */
	public String getHtmlDescription(){
		String stockDetails=("<b>Stock symbol </b>:" +getSymbol()+" "+"<b> ask </b>:"+getAsk()+" "+ "<b> bid </b>:"+getBid()+" "+"<b> date </b> "+sdf.format(date));
		
		return stockDetails;
	}
	
}
