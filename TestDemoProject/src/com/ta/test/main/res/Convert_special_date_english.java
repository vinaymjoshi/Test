package com.ta.test.main.res;

public class Convert_special_date_english 
{
	public static final String YESTERDAY="yesterday";
	public static final String SUMMER="summer";
	public static final String WINTER="winter";
	public static final String SPRING="spring";
	public static final String FALL="fall";
	public static final String SUMMER_YYYY="summer YYYY, summer YY";
	public static final String WINTER_YYYY="winter YYYY, winter YY";
	public static final String SPRING_YYYY="spring YYYY, spring YY";
	public static final String FALL_YYYY="fall YYYY, fall YY";
	
	public static String convert(String specialDt)
	{
		if(specialDt.equalsIgnoreCase(YESTERDAY))
			return "return yesterday's date";//TODO:replace with actual date e.g jul july 2 2nd second, 2012
		else if(specialDt.equalsIgnoreCase(SUMMER))
			return "june july august";
		else if(specialDt.equalsIgnoreCase(WINTER))
			return "december january february";
		else if(specialDt.equalsIgnoreCase(SPRING))
			return "march april may";
		else if(specialDt.equalsIgnoreCase(FALL))
			return "september october november";
		return "";
	}
}
