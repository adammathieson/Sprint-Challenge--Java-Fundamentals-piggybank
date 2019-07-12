package piggyBank;

public class Dollar extends Money
{
	public Dollar(int count)
	{
		super(count);
		value = 1;
	}

	@Override
	public String totalValue()
	{
		return "$" + count;
	}
}