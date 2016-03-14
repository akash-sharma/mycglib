package com.akash.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class SampleInvocationHandler implements InvocationHandler {

	private Object sampleClass;

	SampleInvocationHandler(Object sampleClass) {
		this.sampleClass = sampleClass;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {

		//System.out.println("proxy : " + proxy);
		System.out.println("method : " + method);
		//System.out.println("args : " + Arrays.asList(args));
		return method.invoke(sampleClass, args);
	}
}