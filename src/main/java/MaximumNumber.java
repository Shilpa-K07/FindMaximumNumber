import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaximumNumber<T extends Comparable<T>> {
	Scanner scanner = new Scanner(System.in);
	
	T firstValue, secondValue, thirdValue;
	
	MaximumNumber(T firstValue, T secondValue, T thirdValue){
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.thirdValue = thirdValue;
	}
	public MaximumNumber() {
	}
	
	public static void main(String[] args) {
		MaximumNumber maximumNumber = new MaximumNumber();
		maximumNumber.getUserInputs();
		maximumNumber.getFloatingNumbers();
		maximumNumber.getStringValues();
	}
	
	public static <T extends Comparable<T>> T maximumValue(T firstValue, T secondValue, T thirdValue) throws Exception {
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
	
	public static <T extends Comparable<T>> T maximumValue(ArrayList<T> list) throws Exception {
		T maximumNumber;
		try {
			Collections.sort(list);
			maximumNumber = list.get(list.size()-1);
		}
		catch(Exception e) {
			throw new Exception();
		}
		System.out.println("Maximum of "+list+" is: "+maximumNumber);
		return maximumNumber;
	}
	
	public void findMaximumValue() throws Exception {
		maximumValue(this.firstValue, this.secondValue, this.thirdValue);
	}
	
	private void getStringValues() {
		System.out.println("Enter first string: ");
		String firstString = scanner.next();
		System.out.println("Enter second string: ");
		String secondString = scanner.next();
		System.out.println("Enter third string: ");
		String thirdString = scanner.next();
		try {
			new MaximumNumber(firstString, secondString, thirdString).findMaximumValue();
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
			new MaximumNumber(firstNumber, secondNumber, thirdNumber).findMaximumValue();
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
			new MaximumNumber(firstNumber, secondNumber, thirdNumber).findMaximumValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
