package piggyBank;

public class Quarter extends Money
{
	public Quarter(int count)
	{
		super(count);
		value = .25;
	}

	@Override
	public String totalValue()
	{
		if (this.count == 1)
		{
			return count + "Quarter";
		} else
		{
			return count + "Quarters";
		}
	}
}