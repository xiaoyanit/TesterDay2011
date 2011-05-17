package novoda.pres.testergathering;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MyActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public int addition(int i, int j) {
		return i + j;
	}

	public void onClick(View view) {
		Toast.makeText(getApplicationContext(), "I was clicked",
				Toast.LENGTH_LONG).show();
	}
}
