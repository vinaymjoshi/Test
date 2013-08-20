//package com.ta.test.main;
//
//import android.content.Context;
//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
//import android.graphics.Canvas;
//import android.graphics.Color;
//import android.util.AttributeSet;
//import android.widget.SeekBar;
//
//public class SeekBarCustom extends SeekBar
//{
//
//    private final Bitmap thumbImage = getBackgroundBitmap();
//	public SeekBarCustom(Context context)
//	{
//		super(context);
//	}
//	public SeekBarCustom(Context context, AttributeSet attrs)
//	{
//		super(context);
//	}
//	
//	@Override
//	protected synchronized void onDraw(Canvas canvas)
//	{
//		super.onDraw(canvas);
//		
//	}
//	 private void drawThumb(float screenCoord, boolean pressed, Canvas canvas) {
//         canvas.drawBitmap( thumbImage);//, screenCoord - thumbHalfWidth, (float) ((0.5f * getHeight()) - thumbHalfHeight), paint);
// }
//	 public static  Bitmap getBackgroundBitmap ()
//		{
//		 int bgcolor = Color.rgb(255, 255, 255);
//		 int width=50; int height=50;
//		try
//		    {
//		        Bitmap.Config config = Bitmap.Config.ARGB_8888; // Bitmap.Config.ARGB_8888 Bitmap.Config.ARGB_4444 to be used as these two config constant supports transparency
//		        Bitmap bitmap = Bitmap.createBitmap(width, height, config); // Create a Bitmap
//		 
//		        Canvas canvas =  new Canvas(bitmap); // Load the Bitmap to the Canvas
//		        canvas.drawColor(bgcolor); //Set the color
//		 
//		        return bitmap;
//		    }
//		    catch (Exception e)
//		    {
//		        return null;
//		    }
//		}
//
//}
