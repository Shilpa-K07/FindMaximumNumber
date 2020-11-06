import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {
	
	@Test
	public void givenNumbers_WhenMaxNumberAtFirstPosition_ShouldReturnSameNumber() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		try {
			Assert.assertEquals(Integer.valueOf(90), findMaximumNumber.maximumValue(90, 30, 40));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenNumbers_WhenMaxNumberAtSecondPosition_ShouldReturnSameNumber() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		try {
			Assert.assertEquals(Integer.valueOf(60), findMaximumNumber.maximumValue(30, 60, 40));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenNumbers_WhenMaxNumberAtThirdPosition_ShouldReturnSameNumber() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		try {
			Assert.assertEquals(Integer.valueOf(50), findMaximumNumber.maximumValue(20, 30, 50));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenNumbers_WhenMaxNumberAtFirstPosition_ShouldReturnDiffentNumber() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		try {
			Assert.assertNotEquals(Integer.valueOf(30), findMaximumNumber.maximumValue(90, 30, 40));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenNumbers_WhenMaxNumberAtSecondPosition_ShouldReturnDifferentNumber() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		try {
			Assert.assertNotEquals(Integer.valueOf(40), findMaximumNumber.maximumValue(30, 60, 40));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenNumbers_WhenMaxNumberAtThirdPosition_ShouldReturnDifferentNumber() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		try {
			Assert.assertNotEquals(Integer.valueOf(30), findMaximumNumber.maximumValue(20, 30, 50));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
