package com.acts;

import java.time.LocalTime;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Person's name:");
		Person p1 = new Person(sc.nextLine());

		System.out.println("Enter The time to set Alarm:");
		AlarmClock c = new AlarmClock(sc.nextLine());

		int choice;

		
		while(c.ringingAlarm() != true) ;
		do {
			
			
			System.out.println("1. Press 1 for Snooze."
					+ "\n2.  Press 2 if Woken Up"
					);
			choice = sc.nextInt();
			switch(choice) {
			case 1: {
				if(c.getSnoozeCount()<3) {
				c.snooze();
				}
				else
				{
					System.exit(0);
				}
				break;
			}

			case 2: {
				System.out.println( "1. Enter number of toast");
				int toast = sc.nextInt();
				System.out.println("2. Enter no. of coffee ");
				int coffee = sc.nextInt();
				System.out.println("3. Enter no. of tablespoon of sugar per cup: ");
				int sugar = sc.nextInt();

				c.wokenUp(coffee, sugar, toast);
				System.exit(0);
			}
			}


		}while(choice != 2);
		
		}
		
		
	}



/*

// TODO Auto-generated method stub

		AlarmClock c = new AlarmClock("13:45");
//		System.out.println(c.getCurrentTime());
//		LocalTime newTime = c.getCurrentTime();
//		LocalTime t = newTime.withNano(0).withSecond(0);
//		//LocalTime t1 = newTime.withSecond(0);
//		System.out.println(t);
//		//System.out.println(t1);

		c.ringingAlarm();
		c.snooze();
		//c.snooze();
		//c.snooze();

		c.wokenUp(2, 2, 4);

 */