package com.ta.test.main;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class SeekBarActivity extends Activity {
	public static final String DEBUG_TAG = "SeekBarActivity";
	private ScrollView layout;
	private MarqueeTextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		tv = new MarqueeTextView(this);
		LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
				LinearLayout.LayoutParams.WRAP_CONTENT,
				LinearLayout.LayoutParams.WRAP_CONTENT);
		tv.setLayoutParams(lp);
		layout = (ScrollView) findViewById(R.id.linearLayout1);

		String text = "hi hi first line, lorum ipsum  text \n"
				+ "hi, lorum ipsum  text \n" + "hi, lorum ipsum  text \n"
				+ "hi, lorum ipsum  text \n" + "hi, lorum ipsum  text \n"
				+ "hi, lorum ipsum  text \n" + "hi, lorum ipsum  text \n"
				+ "hi, lorum ipsum  text \n" + "hi, lorum ipsum  text \n"
				+ "hi, lorum ipsum  text \n" + "hi, lorum ipsum  text \n"
				+ "hi, lorum ipsum  text \n" + "hi, lorum ipsum  text \n"
				+ "hi, lorum ipsum  text \n" + "hi, lorum ipsum  text \n"
				+ "hi, lorum ipsum  text \n";
		tv.setTextSize(26);
		
		tv.setTextSize(26);
		tv.setText(text);
		
		layout.addView(tv);

	}

}
