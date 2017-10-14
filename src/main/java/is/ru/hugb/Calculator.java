package is.ru.hugb;

public class Calculator {

	public	static	void main(String[]	args)	{
				
}
	public static int add (String text) {
		if (text.equals("")) {
			return 0;
		}
		else {
			if (text.contains(",")) {
				String numbers[] = text.split(",|\n");
				
				return findSum(numbers);
				
			}
			else {
				return toInt(text);
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

}