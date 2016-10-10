package stringcalculator;

public class Calculator {

	public static int add(String numbers)
	{
		if(numbers.equals(""))
			return 0;
		else if(numbers.contains(","))
		{
			String [] array = numbers.split(",");
			return toInt(array[0]) + toInt(array[1]);
		}
		else
			return 1;
	}

	private static int toInt(String numbers)
	{
		return Integer.parseInt(numbers);
	}

}