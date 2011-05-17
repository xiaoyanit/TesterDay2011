package novoda.pres.testergathering;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AltPathRunner.class)
public class LocalUnitTest {
	@Test
	public void testHelloWorld() {

		MyActivity activity = new MyActivity();
		assertEquals(4, activity.addition(2, 2));
	}
}
