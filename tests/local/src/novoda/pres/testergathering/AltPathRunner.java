package novoda.pres.testergathering;

import java.io.File;

import org.junit.runners.model.InitializationError;

import com.xtremelabs.robolectric.RobolectricTestRunner;

public class AltPathRunner extends RobolectricTestRunner {

	public AltPathRunner(Class<?> testClass) throws InitializationError {
		super(testClass, new File("../../"));
	}

}
