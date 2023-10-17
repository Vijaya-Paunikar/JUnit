package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CubeTest {

	@Test
	public void test() 
	{
		UnitTesting obj=new UnitTesting();
		int ans=obj.cube(5);
		assertEquals(125, ans);
	}

}
