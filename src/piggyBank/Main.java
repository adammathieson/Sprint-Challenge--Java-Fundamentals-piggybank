package piggyBank;

import java.text.DecimalFormat;
import java.util.*;

public class Main
{
	public static void main(String[] arg)
	{
		DecimalFormat fp = new DecimalFormat("$###,###.00");

		ArrayList<Money> piggyBank = new ArrayList<>();

		piggyBank.add(new Quarter());

		piggyBank.forEach(v -> System.out.println(v.totalValue()));
	}
}
