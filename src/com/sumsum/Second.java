package com.sumsum;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends Activity 
{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		TextView tv = (TextView) findViewById(R.id.textView1);
		tv.setText(getIntent().getExtras().getString("thetext"));
	}
}
