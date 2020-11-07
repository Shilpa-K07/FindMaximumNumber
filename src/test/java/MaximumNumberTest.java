import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {
	
	@Test
	public void givenNumbers_WhenMaxNumberAtFirstPosition_ShouldReturnSameNumber() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(30);
		list.add(40);
		try {
			Assert.assertEquals(Integer.valueOf(90), findMaximumNumber.maximumValue(list));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenNumbers_WhenMaxNumberAtSecondPosition_ShouldReturnSameNumber() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		ArrayList list = new ArrayList();
		list.add(30);
		list.add(60);
		list.add(40);
		try {
			Assert.assertEquals(Integer.valueOf(60), findMaximumNumber.maximumValue(list));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenNumbers_WhenMaxNumberAtThirdPosition_ShouldReturnSameNumber() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		ArrayList list = new ArrayList();
		list.add(20);
		list.add(30);
		list.add(50);
		try {
			Assert.assertEquals(Integer.valueOf(50), findMaximumNumber.maximumValue(list));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenNumbers_WhenMaxNumberAtFirstPosition_ShouldReturnDiffentNumber() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(30);
		list.add(40);
		try {
			Assert.assertNotEquals(Integer.valueOf(30), findMaximumNumber.maximumValue(list));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenNumbers_WhenMaxNumberAtSecondPosition_ShouldReturnDifferentNumber() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		ArrayList list = new ArrayList();
		list.add(30);
		list.add(60);
		list.add(40);
		try {
			Assert.assertNotEquals(Integer.valueOf(40), findMaximumNumber.maximumValue(list));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test
	public void givenNumbers_WhenMaxNumberAtThirdPosition_ShouldReturnDifferentNumber() {
		MaximumNumber findMaximumNumber = new MaximumNumber();
		ArrayList list = new ArrayList();
		list.add(20);
		list.add(30);
		list.add(50);
		try {
			Assert.assertNotEquals(Integer.valueOf(30), findMaximumNumber.maximumValue(list));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
