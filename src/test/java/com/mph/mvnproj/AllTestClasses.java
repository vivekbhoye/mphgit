package com.mph.mvnproj;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

public class AllTestClasses {

	@RunWith(Suite.class)
	@SuiteClasses({CalculateTest.class,AssertMethodsTest.class})
	
}
