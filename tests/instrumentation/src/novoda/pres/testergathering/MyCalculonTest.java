package novoda.pres.testergathering;

import android.view.View;
import android.widget.CheckBox;

import com.github.calculon.CalculonStoryTest;
import com.github.calculon.predicate.Predicate;

import static com.github.calculon.assertion.CalculonAssertions.*;
import static com.github.calculon.assertion.ViewAssertion.*;

public class MyCalculonTest extends CalculonStoryTest<MyActivity> {

	public MyCalculonTest() {
		super("novoda.pres.testergathering", MyActivity.class);
	}

	public void testCheckbox() throws Exception {
        assertThat().inPortraitMode();//.viewExists(R.id.checkBox1);

		// assertThat(R.id.button1).visible();
//		assertThat(R.id.checkBox1).click().implies(R.id.checkBox1)
//				.satisfies(new Predicate<View>() {
//					public boolean check(View view) {
//						return ((CheckBox) view).isChecked();
//					}
//				});
	}

}
