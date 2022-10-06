package com.acts;

import java.time.LocalTime;

public class AlarmClock {

	private LocalTime currentTimeDetails;// = LocalTime.now();
	private LocalTime currentTime;// = this.currentTimeDetails.withNano(0).withSecond(0);
	private int snoozeCount = 0;
	private LocalTime alarmTime;


	public AlarmClock(String alarmTimeInput) {
		this.alarmTime = LocalTime.parse(alarmTimeInput);
	}

	public boolean ringingAlarm() {
//		System.out.println(alarmTime);
//		System.out.println(currentTime);
		currentTimeDetails = LocalTime.now();
		currentTime = currentTimeDetails.withNano(0).withSecond(0);
		if(alarmTime.equals(currentTime)) {
			System.out.println("Alarm is ringing");
			return true;
			
		}
		else {
		
			return false;
		}
	}

	public LocalTime getAlarmTime() {
		return this.alarmTime;
	}

	public LocalTime getCurrentTime() {
		return this.currentTime;
	}
	
	public int getSnoozeCount() {
		return this.snoozeCount;
	}

	public void snooze() {
		this.snoozeCount +=1;
		if(this.snoozeCount == 1) {
			//adding 30 min in alarm time
			this.alarmTime = this.alarmTime.plusMinutes(30);
			//msg to coffee class and delay by 12 mins
			CoffeeMaker.delayCoffee(12, this.alarmTime);
			
			CellPhone.call(this.alarmTime); 
			
			System.out.println("Alarm time is increased by 30 mins...." + this.alarmTime);
			

		}
		else if(this.snoozeCount == 2) {
			//add 1 hr in alarm time
			this.alarmTime = this.alarmTime.plusHours(1);
			System.out.println("Alarm time is increased by 1 hour...." + this.alarmTime);
			CoffeeMaker.delayCoffee(60, this.alarmTime);
		}
		else {
			//call jump  and bark method for dog
			System.out.println("Time to call the dog...." + this.currentTime);
			Dog.jump();
		}
	}

	public void wokenUp(double noOfCups, int sugar, int toasts) {
		//wokenTime to be taken
		currentTimeDetails = LocalTime.now();
		currentTime = currentTimeDetails.withNano(0).withSecond(0);
		LocalTime prepareTime  = this.alarmTime.plusMinutes(5);
		
		CoffeeMaker.preparingCoffee(noOfCups, sugar,prepareTime );
		
		Toster.prepareToast(toasts, prepareTime);
		
		CellPhone.timeDifference(this.alarmTime, currentTime);
	}

}
