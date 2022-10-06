package com.acts;

import java.time.LocalTime;

public class CoffeeMaker {

	private static LocalTime currentTimeDetails = LocalTime.now();
	private static LocalTime currentTime = currentTimeDetails.withNano(0).withSecond(0);
	private int beans;
	private int milk;
	private boolean sugar;
	private int water;
	
	public static void delayCoffee(int mins, LocalTime newAlarmTime) {
		System.out.println("Making the coffee by "+ newAlarmTime.plusMinutes(mins));
		Toster.holdToast();
		
	}
	
	public static void preparingCoffee(double noOfCups, int sugar, LocalTime prepareTime ) {
		System.out.println("Preaping coffee in : " + prepareTime);
		
		double quantityMilk = (3 * noOfCups) / 4;
		double quantityWater = (1 * noOfCups) / 4;
		double noOfBeans = 5 * noOfCups;
		
		System.out.println(noOfCups + " Coffee prepared...");
		System.out.println("Used Quantity:" + ",Quantity of milk:" + quantityMilk + ",Quantity of water:" + quantityWater      
				+ ",Beans used:" + noOfBeans + ",Quantity of Sugar:" + sugar + "tablespoons"
				);
	}
	
	
}
