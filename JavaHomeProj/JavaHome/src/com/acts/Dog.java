package com.acts;

public class Dog {
	
	private boolean takePaper;
	private boolean walk;

	public static void walk() {
		System.out.println("Sam is walking");
	}
	
	public static void bark() {
		System.out.println("Sam says woof woof");
	}
	
	public static void jump() {
		System.out.println("Sam is jumping");
		Dog.bark();
		Dog.getPaper();
	}
	
	public static void getPaper() {
		System.out.println("Getting paper ...");
	}
	
}
