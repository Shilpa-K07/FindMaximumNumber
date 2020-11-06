import org.junit.Assert;
import org.junit.Test;

public class MaximumFloatNumberTest {
		@SuppressWarnings("deprecation")
		@Test
		public void givenFloatingNumbers_WhenMaxNumberAtFirstPosition_ShouldReturnSameNumber() {
			MaximumNumber findMaximumNumber = new MaximumNumber();
			try {
				Assert.assertEquals(80.4f, findMaximumNumber.findMaximumNumber(80.4f, 60.6f, 40.4f), 0.001);
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
		
		@Test
		public void givenFloatingNumbers_WhenMaxNumberAtSecondPosition_ShouldReturnSameNumber() {
			MaximumNumber findMaximumNumber = new MaximumNumber();
			try {
				Assert.assertEquals(60.6f, findMaximumNumber.findMaximumNumber(30.4f, 60.6f, 40.4f), 0.001);
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
		
		@Test
		public void givenFloatingNumbers_WhenMaxNumberAtThirdPosition_ShouldReturnSameNumber() {
			MaximumNumber findMaximumNumber = new MaximumNumber();
			try {
				Assert.assertEquals(50.6f, findMaximumNumber.findMaximumNumber(20.6f, 30.6f, 50.6f), 0.001);
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
		
		@Test
		public void givenFloatingNumbers_WhenMaxNumberAtFirstPosition_ShouldReturnDiffentNumber() {
			MaximumNumber findMaximumNumber = new MaximumNumber();
			try {
				Assert.assertNotEquals(30.8f, findMaximumNumber.findMaximumNumber(90.6f, 30.8f, 40.5f));
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
		
		@Test
		public void givenFloatingNumbers_WhenMaxNumberAtSecondPosition_ShouldReturnDifferentNumber() {
			MaximumNumber findMaximumNumber = new MaximumNumber();
			try {
				Assert.assertNotEquals(40.8f, findMaximumNumber.findMaximumNumber(30.5f, 60.7f, 40.8f));
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
		
		@Test
		public void givenFloatingNumbers_WhenMaxNumberAtThirdPosition_ShouldReturnDifferentNumber() {
			MaximumNumber findMaximumNumber = new MaximumNumber();
			try {
				Assert.assertNotEquals(30.9f, findMaximumNumber.findMaximumNumber(20.6f, 30.9f, 50.5f));
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
}
