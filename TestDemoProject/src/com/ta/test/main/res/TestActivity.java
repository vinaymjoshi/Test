package com.ta.test.main.res;

import com.ta.test.main.R;
import com.ta.test.main.R.id;
import com.ta.test.main.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TestActivity extends Activity
{
	static String TAG=TestActivity.class.getSimpleName();
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		Log.e(TAG,"onCreate");
		setContentView(R.layout.main);
		Button b=(Button)findViewById(R.id.button1);
		b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				
				  Intent intent = new Intent(TestActivity.this,NewActivity.class);
				  intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT | Intent.FLAG_ACTIVITY_NEW_TASK);
				  
//		          intent2.setAction(Intent.ACTION_MAIN);
//		          intent2.addCategory(Intent.CATEGORY_LAUNCHER);
//		          intent2.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT | Intent.FLAG_ACTIVITY_NEW_TASK);
//		          intent2.setClassName("com.techahead.ctc.main", "com.andrew.apollo.activities.MusicLibrary"); 
//
//		          Intent intent = new Intent(Intent.ACTION_MAIN);
//					 PackageManager manager = getPackageManager();
//					 intent = manager.getLaunchIntentForPackage("com.techahead.ctc.main");
//					 intent.addCategory(Intent.CATEGORY_LAUNCHER);
//					 startActivity(intent);
		          getApplicationContext().startActivity(intent);
			}
		});
	}
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.e(TAG,"onStart()");
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.e(TAG,"onResume()");
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.e(TAG,"onPause()");
	}
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.e(TAG,"onStop()");
	}
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.e(TAG,"onRestart");
	}
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.e(TAG,"onDestroy");
	}
	
}
