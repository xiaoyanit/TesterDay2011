package novoda.pres.testergathering;

import junit.framework.Assert;
import android.test.ActivityInstrumentationTestCase2;

import com.jayway.android.robotium.solo.Solo;

/**
 * This is a simple framework for a test of an Application. See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more
 * information on how to write and extend Application tests.
 * <p/>
 * To run this test, you can type: adb shell am instrument -w \ -e class
 * novoda.pres.testergathering.MyActivityTest \
 * novoda.pres.testergathering.tests/android.test.InstrumentationTestRunner
 */
public class MyActivityTest extends
		ActivityInstrumentationTestCase2<MyActivity> {
	private Solo solo;

	public MyActivityTest() {
		super("novoda.pres.testergathering", MyActivity.class);
	}

	public void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
	}

	public void testButtonClick() throws Exception {
		solo.clickOnButton("Click me");
		Assert.assertTrue(solo.searchText("I was clicked"));
	}

}
