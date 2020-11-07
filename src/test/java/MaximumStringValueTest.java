import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class MaximumStringValueTest {
	
	@Test
	public void givenStrings_WhenMaxStringAtFirstPosition_ShouldReturnSameString() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		ArrayList list = new ArrayList();
		list.add("white");
		list.add("red");
		list.add("black");
		try {
			Assert.assertEquals("white", findMaximumNumber.maximumValue(list));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenStrings_WhenMaxStringAtSecondPosition_ShouldReturnSameString() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		ArrayList list = new ArrayList();
		list.add("red");
		list.add("yellow");
		list.add("black");
		try {
			Assert.assertEquals("yellow", findMaximumNumber.maximumValue(list));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenStrings_WhenMaxStringAtThirdPosition_ShouldReturnSameString() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		ArrayList list = new ArrayList();
		list.add("red");
		list.add("green");
		list.add("yellow");
		try {
			Assert.assertEquals("yellow", findMaximumNumber.maximumValue(list));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenStrings_WhenMaxStringAtFirstPosition_ShouldReturnDifferentString() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		ArrayList list = new ArrayList();
		list.add("white");
		list.add("red");
		list.add("black");
		try {
			Assert.assertNotEquals("black", findMaximumNumber.maximumValue(list));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenStrings_WhenMaxStringAtSecondPosition_ShouldReturnDifferentString() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		ArrayList list = new ArrayList();
		list.add("black");
		list.add("white");
		list.add("red");
		try {
			Assert.assertNotEquals("red", findMaximumNumber.maximumValue(list));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenStrings_WhenMaxStringAtThirdPosition_ShouldReturnDifferentString() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		ArrayList list = new ArrayList();
		list.add("black");
		list.add("red");
		list.add("white");
		try {
			Assert.assertNotEquals("red", findMaximumNumber.maximumValue(list));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
