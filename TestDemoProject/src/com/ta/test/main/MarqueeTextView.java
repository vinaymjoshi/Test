package com.ta.test.main;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Scroller;
import android.widget.TextView;

class MarqueeTextView extends TextView /* implements OnTouchListener */
{
	private Scroller mScroller;
	private static final int SCROLL_DURATION = 40000;

	public MarqueeTextView(Context context) {
		super(context);
		mScroller = new Scroller(context);
	}

	public MarqueeTextView(Context context, AttributeSet a) {
		super(context, a);
	}

	@Override
	protected void onSizeChanged(int w, int h, int oldw, int oldh) {
		super.onSizeChanged(w, h, oldw, oldh);
		mScroller.startScroll(0, oldh, 0, h, SCROLL_DURATION);
		setScroller(mScroller);
		invalidate();
		postDelayed(new Runnable() {

			@Override
			public void run() {
				if (mScroller.computeScrollOffset()) {
					// Get current x and y positions
					int currX = mScroller.getCurrX();
					int currY = mScroller.getCurrY();
					// Log.e("currX,currY", currX + "," + currY);
					mScroller.startScroll(0, currY, 0, -currY, 0);
					setScroller(mScroller);
				}

			}
		}, SCROLL_DURATION / 2);

	}

}