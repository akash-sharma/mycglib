package com.akash.jdkproxy;

public class SampleClass implements SampleInterface {

	public void test1() {

		System.out.println("test1");
	}

	public String test2() {

		System.out.println("test2");
		return "Hello world";
	}

	public String test3(String args) {

		System.out.println("test3 " + args);
		return "hello world";
	}

	public static void test4() {

		System.out.println("test4");
	}
}