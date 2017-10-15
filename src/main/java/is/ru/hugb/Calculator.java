package is.ru.hugb;

public class Calculator {

	public	static	void main(String[]	args)	{
				
}
	public static int add (String text) {
		if (text.equals("")) {
			return 0;
		}
		else {
			String numbers[] = delimeter(text);

			String negative = negative(numbers);

			if (negative.length() != 23) {
				negative = negative.substring(0, negative.length() - 1);
				throw new RuntimeException(negative);
			}
			else {
				return findSum(numbers);
			}		
		}
	}

	private static int toInt (String number) {
		return Integer.parseInt(number);
	}

	private static int findSum(String[] numbers) {
		int sum = 0;

		for (String number: numbers) {
				if (toInt(number) <= 1000) {
					sum += toInt(number);
				}
			}

		return sum;
	}

	private static String negative (String[] numbers) {
		String negativeNumbers = "Negatives not allowed: ";

		for (String number : numbers) {
			if (toInt(number) < 0) {
				negativeNumbers += (number + ",");	
			}
		}

		return negativeNumbers;
	}

	private static String[] delimeter(String text) {

		String [] numbers;
		if (text.length() == 1) {
			numbers = text.split(",|\n");
			return numbers;
		}

		if (text.substring(0,2).equals("//")) {
			char delimeter = text.charAt(2);
			String delimeterString = text.substring(4,text.length());
			numbers = delimeterString.split(Character.toString(delimeter));
			return numbers;
		}
		else {
			numbers = text.split(",|\n");
			return numbers;
		}
	}
}