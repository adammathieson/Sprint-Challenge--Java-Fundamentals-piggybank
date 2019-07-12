package piggyBank;

public abstract class Money
{
	public int count = 1;
	public double value;

	public Money(int count)
	{
		this.count = count;
	}

	// Absrtct methods
	public abstract String totalValue();


	// methods
	public int getCount()
	{
		return count;
	}

	public double getTally()
	{
		return count * value;
	}


}