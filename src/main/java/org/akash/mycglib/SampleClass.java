package org.akash.mycglib;

public class SampleClass {

	public String test(String input) {
		System.out.println("public method");
		return "Hello world!";
	}

	protected String test1(String input) {
		System.out.println("protected method");
		return "Hello world!";
	}

	String test2(String input) {
		System.out.println("default method");
		return "Hello world!";
	}

	private String test3(String input) {
		System.out.println("private method");
		return "Hello world!";
	}
	
	public static String test4(String input) {
		System.out.println("static method");
		return "Hello world!";
	}
}