import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {
	
	@Test
	public void givenNumbers_WhenMaxNumberAtFirstPosition_ShouldReturnSameNumber() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		try {
			Assert.assertEquals(90, findMaximumNumber.findMaximumNumber(90, 30, 40));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenNumbers_WhenMaxNumberAtSecondPosition_ShouldReturnSameNumber() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		try {
			Assert.assertEquals(60, findMaximumNumber.findMaximumNumber(30, 60, 40));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenNumbers_WhenMaxNumberAtThirdPosition_ShouldReturnSameNumber() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		try {
			Assert.assertEquals(50, findMaximumNumber.findMaximumNumber(20, 30, 50));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenNumbers_WhenMaxNumberAtFirstPosition_ShouldReturnDiffentNumber() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		try {
			Assert.assertNotEquals(30, findMaximumNumber.findMaximumNumber(90, 30, 40));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenNumbers_WhenMaxNumberAtSecondPosition_ShouldReturnDifferentNumber() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		try {
			Assert.assertNotEquals(40, findMaximumNumber.findMaximumNumber(30, 60, 40));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenNumbers_WhenMaxNumberAtThirdPosition_ShouldReturnDifferentNumber() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		try {
			Assert.assertNotEquals(30, findMaximumNumber.findMaximumNumber(20, 30, 50));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
