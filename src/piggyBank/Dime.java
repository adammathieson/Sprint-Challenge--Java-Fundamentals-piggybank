package piggyBank;

public class Dime extends Money
{
	public Dime(int count)
	{
		super(count);
		value = .1;
	}

	@Override
	public String totalValue()
	{
		if (this.count == 1)
		{
			return count + "Dime";
		} else
		{
			return count + "Dimes";
		}
	}
}