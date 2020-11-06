import org.junit.Assert;
import org.junit.Test;

public class MaximumStringValueTest {
	
	@Test
	public void givenStrings_WhenMaxStringAtFirstPosition_ShouldReturnSameString() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		try {
			Assert.assertEquals("white", findMaximumNumber.maximumValue("white", "red", "black"));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenStrings_WhenMaxStringAtSecondPosition_ShouldReturnSameString() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		try {
			Assert.assertEquals("yellow", findMaximumNumber.maximumValue("red", "yellow", "black"));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenStrings_WhenMaxStringAtThirdPosition_ShouldReturnSameString() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		try {
			Assert.assertEquals("yellow", findMaximumNumber.maximumValue("red", "green", "yellow"));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenStrings_WhenMaxStringAtFirstPosition_ShouldReturnDifferentString() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		try {
			Assert.assertNotEquals("black", findMaximumNumber.maximumValue("white", "red", "black"));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenStrings_WhenMaxStringAtSecondPosition_ShouldReturnDifferentString() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		try {
			Assert.assertNotEquals("red", findMaximumNumber.maximumValue("black", "white", "red"));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenStrings_WhenMaxStringAtThirdPosition_ShouldReturnDifferentString() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		try {
			Assert.assertNotEquals("red", findMaximumNumber.maximumValue("black", "red", "white"));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
