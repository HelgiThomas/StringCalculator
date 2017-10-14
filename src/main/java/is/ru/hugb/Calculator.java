package is.ru.hugb;

public class Calculator {

	public	static	void main(String[]	args)	{
				
}
	public static int add (String text) {
		if (text.equals("")) {
			return 0;
		}
		else {
			String numbers[] = text.split(",|\n");
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
				sum += toInt(number);
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

}