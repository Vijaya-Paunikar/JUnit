package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {

	@Test
	public void test() 
	{
		UnitTesting obj=new UnitTesting();
		int ans=obj.sum(6, 4);
		assertEquals(10, ans);
	}

}
