package com.juanpickselov.learning.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class JUnitAssertFun {

	@Test
	public void assertThatFun() {
		assertThat("+1 (234) 567-8900", is("+1 (234) 567-8900"));
	}

	@Test
	public void assertEqualsFun() {
		assertEquals("blah", "blah");
	}

	@Test
	public void assertArrayEqualsFun() {
		String[] stringRay1 = { "Boo", "Boo" };
		String[] stringRay2 = { "Boo", "Boo" };
		assertArrayEquals(stringRay1, stringRay2);
	}
	
	@Test
	public void assertSameFun() {
		String[] stringRay1 = { "Boo", "Boo" };
		String[] stringRay2 = stringRay1;
		assertSame(stringRay1, stringRay2);
	}
	
}
