import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class MaximumFloatNumberTest {
		@SuppressWarnings("deprecation")
		@Test
		public void givenFloatingNumbers_WhenMaxNumberAtFirstPosition_ShouldReturnSameNumber() {
			MaximumNumber findMaximumNumber = new MaximumNumber();
			ArrayList list = new ArrayList();
			list.add(80.4f);
			list.add(60.6f);
			list.add(40.4f);
			try {
				Assert.assertEquals(80.4f, (float) findMaximumNumber.maximumValue(list), 0.001);
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
		
		@Test
		public void givenFloatingNumbers_WhenMaxNumberAtSecondPosition_ShouldReturnSameNumber() {
			MaximumNumber findMaximumNumber = new MaximumNumber();
			ArrayList list = new ArrayList();
			list.add(30.4f);
			list.add(60.6f);
			list.add(40.4f);
			try {
				Assert.assertEquals(60.6f, (float) findMaximumNumber.maximumValue(list), 0.001);
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
		
		@Test
		public void givenFloatingNumbers_WhenMaxNumberAtThirdPosition_ShouldReturnSameNumber() {
			MaximumNumber findMaximumNumber = new MaximumNumber();
			ArrayList list = new ArrayList();
			list.add(20.6f);
			list.add(30.6f);
			list.add(50.6f);
			try {
				Assert.assertEquals(50.6f, (float) findMaximumNumber.maximumValue(list), 0.001);
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
		
		@Test
		public void givenFloatingNumbers_WhenMaxNumberAtFirstPosition_ShouldReturnDiffentNumber() {
			MaximumNumber findMaximumNumber = new MaximumNumber();
			ArrayList list = new ArrayList();
			list.add(90.6f);
			list.add(30.8f);
			list.add(40.5f);
			try {
				Assert.assertNotEquals(30.8f, findMaximumNumber.maximumValue(list));
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
		
		@Test
		public void givenFloatingNumbers_WhenMaxNumberAtSecondPosition_ShouldReturnDifferentNumber() {
			MaximumNumber findMaximumNumber = new MaximumNumber();
			ArrayList list = new ArrayList();
			list.add(30.5f);
			list.add(60.7f);
			list.add(40.8f);
			try {
				Assert.assertNotEquals(40.8f, findMaximumNumber.maximumValue(list));
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
		
		@Test
		public void givenFloatingNumbers_WhenMaxNumberAtThirdPosition_ShouldReturnDifferentNumber() {
			MaximumNumber findMaximumNumber = new MaximumNumber();
			ArrayList list = new ArrayList();
			list.add(20.6f);
			list.add(30.9f);
			list.add(50.5f);
			try {
				Assert.assertNotEquals(30.9f, findMaximumNumber.maximumValue(20.6f, 30.9f, 50.5f));
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
}

