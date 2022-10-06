package com.acts;

import java.time.LocalTime;

public  class Toster {

	
	public static void holdToast() {
		System.out.println("Hold the toast, snooze button pressed");
	}
	
	public static void prepareToast(int toasts, LocalTime prepareTime ) {
		System.out.println("Preaping Toasts in : " + prepareTime);
		System.out.println("Person woken up, Toasts will be ready in " +  prepareTime);
	}
}
