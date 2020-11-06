import java.util.Scanner;

public class MaximumNumber {
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		MaximumNumber maximumNumber = new MaximumNumber();
		maximumNumber.getUserInputs();
		maximumNumber.getFloatingNumbers();
		maximumNumber.getStringValues();
	}

	private void getStringValues() {
		System.out.println("Enter first string: ");
		String firstString = scanner.next();
		System.out.println("Enter second string: ");
		String secondString = scanner.next();
		System.out.println("Enter third string: ");
		String thirdString = scanner.next();
		try {
			findMaximumNumber(firstString, secondString, thirdString);
		} catch (Exception e) {
			e.printStackTrace();
		}
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

	public <T extends Comparable<T>> T findMaximumNumber(T firstValue, T secondValue, T thirdValue) throws Exception {
		T maxNumber = firstValue;
		try {
			if(secondValue.compareTo(maxNumber) > 0 )
				maxNumber = secondValue;
			if(thirdValue.compareTo(maxNumber) > 0 )
				maxNumber = thirdValue;
			System.out.println("Maximum of "+firstValue+", "+secondValue+", "+thirdValue+" is: "+maxNumber);
		}
		catch(Exception e) {
			throw new Exception();
		}
		return maxNumber;
	}
}
