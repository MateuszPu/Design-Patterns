package com.observer.design.pattern;
import java.util.ArrayList;


public class StockGrabber implements Subject
{
	private ArrayList<Observer> observers;
	private double kghmPrice;
	private double tauronPrice;
	private double pzuPrice;
	
	public StockGrabber()
	{
		observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer newObserver)
	{
		observers.add(newObserver);
	}

	@Override
	public void unregister(Observer deleteObserver)
	{
		int observerIndex = observers.indexOf(deleteObserver);
		
		System.out.println("Observer " + (observerIndex+1) + " deleted");
		
		observers.remove(observerIndex);
	}

	@Override
	public void notifyObserver()
	{
		for(Observer observer: observers)
		{
			observer.update(kghmPrice, tauronPrice, pzuPrice);
		}
	}
	
	public void setKghmPrice(double newKghmPrice)
	{
		this.kghmPrice = newKghmPrice;
		notifyObserver();
	}
	
	public void setTauronPrice(double newTauronPrice)
	{
		this.tauronPrice = newTauronPrice;
		notifyObserver();
	}
	
	
	public void setPzuPrice(double newPzuPrice)
	{
		this.pzuPrice = newPzuPrice;
		notifyObserver();
	}
	
	
}
