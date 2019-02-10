package com.chen.git;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTools {

	public static String getCurrentDate() {
		return new SimpleDateFormat("yyyy:MM:dd hh:mm:ss").format(new Date());
	}
}
