package com.akash.jdkproxy;

import java.lang.reflect.Proxy;

public class InvocationHandlerExample {

	public static void main(String args[]) {

		SampleInterface proxy = (SampleInterface) Proxy.newProxyInstance(
				SampleInterface.class.getClassLoader(),
				new Class[] { SampleInterface.class },
				new SampleInvocationHandler(new SampleClass()));
		proxy.test1();
		proxy.test2();
		proxy.test3("proxy args");
		//System.out.println(proxy);
		//System.out.println(proxy.hashCode());
	}
}