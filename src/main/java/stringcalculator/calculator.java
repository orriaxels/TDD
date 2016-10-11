package stringcalculator;

import java.util.ArrayList;

public class Calculator {

	private static String splitter = ",|\\n";

	public static int add(String numbers)
	{
		ArrayList<Integer> negativeNumbers = new ArrayList<Integer>();
		if(!numbers.equals(""))
		{
			String [] text = splitNumbers(numbers);
			addNegNumber(text, negativeNumbers);
		}

		if(negativeNumbers.size() > 0)
		{
			String neg = createNegNumbers(negativeNumbers);
			throw new IllegalArgumentException("Negatives not allowed: " + neg);
		}



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

	private static void addNegNumber(String[] numbers, ArrayList<Integer> negativeNumbers)
	{
		for (String number : numbers)
		{
			int x = toInt(number);
			if(x < 0)
				negativeNumbers.add(x);
		}
	}

	private static String createNegNumbers(ArrayList<Integer> negativeNumbers)
	{
		String negString = "";
		for(Integer i : negativeNumbers)
		{
			String o = Integer.toString(i);
			if(negString.equals(""))
				negString = o;
			else
				negString = negString + "," + o;
		}

		return negString;
	}
}