package com.simpleMaths.MathMate;






import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;

public class TestMaths
{

	static App app;
	
	@BeforeClass
	public static  void init()
	{
		app=new App();
		
	}
	@Test
	public void sumTestCase()
	{
		assertEquals(12,app.sum(10,2));
	}
}
