package com.acts;

import java.time.LocalTime;

public  class CellPhone {
	
	public static void call(LocalTime time) {
		
		System.out.println("Call Bob by " + time);
		System.out.println("We are running late");
	}
	
	//
	public static void timeDifference(LocalTime alarmTime, LocalTime wokenTime) {
		
		int hours = wokenTime.getHour() - alarmTime.getHour();
		int min = wokenTime.getMinute() - alarmTime.getMinute();
		System.out.println("Your late by =  " + hours+":"+min);
	}

}
