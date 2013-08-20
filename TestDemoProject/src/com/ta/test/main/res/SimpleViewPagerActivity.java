package com.ta.test.main.res;
//package com.ta.test.main;
//
//import android.app.Activity;
//import android.content.Context;
//import android.os.Bundle;
//import android.os.Parcelable;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.widget.ImageView;
//import android.widget.Toast;
//
//public class SimpleViewPagerActivity extends Activity {
//	/** Called when the activity is first created. */
//	@Override
//	public void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.main);
//
////		MyPagerAdapter adapter = new MyPagerAdapter();
////		ViewPager myPager = (ViewPager) findViewById(R.id.myfivepanelpager);
////		myPager.setAdapter(adapter);
////		myPager.setCurrentItem(0);
//	}
//	
//	public void farLeftButtonClick(View v)
//	{
//		Toast.makeText(this, "Far Left Button Clicked", Toast.LENGTH_SHORT).show(); 
//
//	}
//
//	public void farRightButtonClick(View v)
//	{
//		Toast.makeText(this, "Far Right Elephant Button Clicked", Toast.LENGTH_SHORT).show(); 
//
//	}
//
//	private class MyPagerAdapter extends PagerAdapter {
//
//		public int getCount() {
//			return 5;
//		}
//
//		public Object instantiateItem(View collection, int position) {
//
//			LayoutInflater inflater = (LayoutInflater) collection.getContext()
//					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//			int resId  = R.layout.pageview;
//			View view = inflater.inflate(resId, null);
//			ImageView im=(ImageView)view.findViewById(R.id.how_to_use_image);
//			switch (position) {
//			case 0:
//				im.setImageResource(R.drawable.splash);
//				break;
//			case 1:
//				im.setImageResource(R.drawable.ic_launcher);
//				break;
//			case 2:
//
//				im.setImageResource(R.drawable.splash);
//				break;
//			case 3:
//
//				im.setImageResource(R.drawable.ic_launcher);
//				break;
//			case 4:
//				im.setImageResource(R.drawable.splash);
//				break;
//			}
//
//			
//
//			((ViewPager) collection).addView(view, 0);
//
//			return view;
//		}
//
//		@Override
//		public void destroyItem(View arg0, int arg1, Object arg2) {
//			((ViewPager) arg0).removeView((View) arg2);
//
//		}
//
//		@Override
//		public void finishUpdate(View arg0) {
//			// TODO Auto-generated method stub
//
//		}
//
//		@Override
//		public boolean isViewFromObject(View arg0, Object arg1) {
//			return arg0 == ((View) arg1);
//
//		}
//
//		@Override
//		public void restoreState(Parcelable arg0, ClassLoader arg1) {
//			// TODO Auto-generated method stub
//
//		}
//
//		@Override
//		public Parcelable saveState() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		@Override
//		public void startUpdate(View arg0) {
//			// TODO Auto-generated method stub
//
//		}
//
//	}
//
//}