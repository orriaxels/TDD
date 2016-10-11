package stringcalculator;

public class Calculator {

	private static String splitter = ",|\\n";

	public static int add(String numbers)
	{
		if(numbers.equals(""))
			return 0;
		else if(numbers.contains(",") || numbers.contains("\n"))
			return sum(splitNumbers(numbers));
		else
			return 1;
	}

	private static int toInt(String numbers)
	{
		return Integer.parseInt(numbers);
	}

	private static String[] splitNumbers(String numbers)
	{
		return numbers.split(splitter);
	}

	private static int sum(String[] numbers)
	{
		int total = 0;
		for(String number : numbers)
		{
			total += toInt(number);
		}
		return total;
	}

/*	private static String[] replaceNewline(String numbers)
	{
		numbers = numbers.replace("\n", ",");
		return splitNumbers(numbers);
	}*/
}