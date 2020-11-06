import java.util.Scanner;

public class MaximumNumber {
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		MaximumNumber maximumNumber = new MaximumNumber();
		maximumNumber.getUserInputs();
	}

	private void getUserInputs() {
		System.out.println("Enter first number: ");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter second number: ");
		int secondNumber = scanner.nextInt();
		System.out.println("Enter third number: ");
		int thirdNumber = scanner.nextInt();
		try {
			findMaximumNumber(firstNumber, secondNumber, thirdNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int findMaximumNumber(Integer firstNumber, Integer secondNumber, Integer thirdNumber) throws Exception {
		int maxNumber = firstNumber;
		try {
			if(secondNumber.compareTo(maxNumber) > 0 )
				maxNumber = secondNumber;
			if(thirdNumber.compareTo(maxNumber) > 0 )
				maxNumber = thirdNumber;
			System.out.println("Maximum of "+firstNumber+", "+secondNumber+", "+thirdNumber+" is: "+maxNumber);
		}
		catch(Exception e) {
			throw new Exception();
		}
		return maxNumber;
	}
}
