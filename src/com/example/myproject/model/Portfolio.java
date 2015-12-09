package com.example.myproject.model;
/**
 * 
 * Portfolio- its a class that create and add a new stock to an array stock.
 * this class offer an opportunity to print the portfolio that include the stock that we add. 
 *
 */
public class Portfolio {
	private String title = new String ("<h1> Portfolio </h1>");
	final static int MAX_PORTFOLIO_SIZE = 5;
	private Stock[] stocks;
	private int portFolioSize = 0;
	
	public int getMaxPortfolioSize() {
		return MAX_PORTFOLIO_SIZE;
	}

	public void setStocksArray(Stock[] stocks) {
		this.stocks = stocks;
	}
/**
 * create a new place in the memory to the class stock who's his size is MAX_PORTFOLIO_SIZE. 
 */
	public Portfolio() {
		stocks = new Stock [MAX_PORTFOLIO_SIZE];
	}
	
	/**
	 * this is copy contractor.
	 */	
	
public Portfolio(Portfolio portfolio)
{
	this.title = portfolio.title;
	this.portFolioSize = portfolio.getMaxPortfolioSize();
	stocks = new Stock [MAX_PORTFOLIO_SIZE];
	
	for(int i = 0 ; i< portFolioSize; i++)
	{
		this.stocks[i]=portfolio.stocks[i];
	}
}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
/**
 * 
 * this method add stock to the current place in the array.
 */
	public void addStock (Stock stock){
		if(portFolioSize < MAX_PORTFOLIO_SIZE){
			stocks[portFolioSize++] = stock;	
		}
		else
			return;
	}
public void removeStock(Stock[] stock)
{
	for(int i = 0 ; i < portFolioSize ; i++)
	{
	  stocks[i]=stocks[i+1];
	}
	stocks[portFolioSize]=null;
	portFolioSize--;
}
	public Stock[] getStocks() {
		return stocks;
	}
	/**
	 * this method create a new string and print the stock portfolio data.
	 */
	public String getHtmlString() {
			String stringPortFolioTitle = new String();
	    	stringPortFolioTitle = ("<h1>Portfolio</h1>");
	   
	    	for(int i = 0 ; i < portFolioSize; i++)
	    	{
	    		stringPortFolioTitle = stringPortFolioTitle.concat("stock no."+i+ ": "+stocks[i].getHtmlDescription()+"<br>"+"<br>");
	    	}
	    	return stringPortFolioTitle;
	    }

	public void changeLastStocksBid(float d,Stock[] stock)
	{
	stock[portFolioSize].setBid(d);	
	}

	}
	
