/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Jul 16, 2018
 */

package com.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author n0217055
 *
 */
public class TestRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Result result = JUnitCore.runClasses(BasicAnnotationTest.class);
		for (Failure failure : result.getFailures()){
			System.out.println(failure.toString());
			System.out.println(result.getFailureCount());
		}
		System.out.println("Result=="+result.wasSuccessful());
	}

}
