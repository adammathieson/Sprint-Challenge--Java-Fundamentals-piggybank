package piggyBank;

public class Penny extends Money
{
	public Penny(int count)
	{
		super(count);
		value = .01;
	}

	@Override
	public String totalValue()
	{
		if (this.count == 1)
		{
			return count + "Penny";
		} else
		{
			return count + "Pennies";
		}
	}
}