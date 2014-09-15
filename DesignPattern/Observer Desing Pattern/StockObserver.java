public class StockObserver implements Observer
{
	private double kghmPrice;
	private double tauronPrice;
	private double pzuPrice;

	private static int observerIDTracker = 0;
	private int observerID;

	private Subject stockGrabber;

	public StockObserver(Subject stockGrabber)
	{
		this.stockGrabber = stockGrabber;
		this.observerID = ++observerIDTracker;

		System.out.println("New observer " + this.observerID);

		stockGrabber.register(this);
	}

	@Override
	public void update(double kghmPrice, double tauronPrice, double pzuPrice)
	{
		this.kghmPrice = kghmPrice;
		this.tauronPrice = tauronPrice;
		this.pzuPrice = pzuPrice;

		printThePrices();
	}

	public void printThePrices()
	{
		System.out.println(observerID + "\nKGHM: " + kghmPrice + "\nTAURON: " + tauronPrice + "\nPZU: " + pzuPrice
				+ "\n");
	}
}
