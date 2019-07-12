package piggyBank;

public class Nickel extends Money
{
	public Nickel(int count)
	{
		super(count);
		value = .05;
	}

	public Nickel()
	{
		value = .05;
	}

	@Override
	public String totalValue()
	{
		if (this.count == 1)
		{;
			return count + " Nickels";
		} else
		{ 
			return count + " Nickels";
		}
	}
}