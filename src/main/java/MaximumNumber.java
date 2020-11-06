import java.util.Scanner;

public class MaximumNumber {
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		MaximumNumber maximumNumber = new MaximumNumber();
		maximumNumber.getUserInputs();
		maximumNumber.getFloatingNumbers();
	}

	private void getFloatingNumbers() {
		System.out.println("Enter first floating number: ");
		float firstNumber = scanner.nextFloat();
		System.out.println("Enter second floating number: ");
		float secondNumber = scanner.nextFloat();
		System.out.println("Enter third floating number: ");
		float thirdNumber = scanner.nextFloat();
		try {
			findMaximumNumber(firstNumber, secondNumber, thirdNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public double findMaximumNumber(Float firstNumber, Float secondNumber, Float thirdNumber) throws Exception {
		float maxNumber = firstNumber;
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
