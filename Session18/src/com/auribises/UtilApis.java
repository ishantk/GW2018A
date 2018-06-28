package com.auribises;

import java.math.BigInteger;
import java.math.MathContext;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class UtilApis {

	public static void main(String[] args) {
		
		Date date = new Date();
		String dateTimeStamp = date.toString();
		System.out.println(dateTimeStamp);
		
		//SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("HH:mm:ss");
		String newDate = dateFormat.format(date);
		String newDate1 = dateFormat1.format(date);
		System.out.println(newDate);
		System.out.println(newDate1);
		
		Calendar calendar = Calendar.getInstance();
		
		//calendar.set(Calendar.YEAR, 2020);
		
		int dd = calendar.get(Calendar.DAY_OF_MONTH);
		int mm = calendar.get(Calendar.MONTH); // (0-11)
		int yy = calendar.get(Calendar.YEAR);
		
		int hh = calendar.get(Calendar.HOUR_OF_DAY);
		int mi = calendar.get(Calendar.MINUTE);
		
		System.out.println(dd+"/"+(mm+1)+"/"+yy);
		System.out.println(hh+":"+mi);
		
		// Thread-Safe
		AtomicInteger aRef = new AtomicInteger(10);
		
		BigInteger bRef = new BigInteger("10");
		
		System.out.println(Math.PI);
		System.out.println(Math.sin(30));
		System.out.println(Math.log10(100));
		
	}

}
