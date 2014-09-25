package com.observer.design.pattern;

public class GrabStocks
{
	public static void main(String[] args)
	{
		StockGrabber stockGrabber = new StockGrabber();

		StockObserver observer1 = new StockObserver(stockGrabber);

		stockGrabber.setKghmPrice(123.00);
		stockGrabber.setTauronPrice(167.32);
		stockGrabber.setPzuPrice(23.32);

	}
}
