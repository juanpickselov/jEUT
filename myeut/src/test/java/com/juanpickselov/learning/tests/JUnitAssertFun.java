package com.juanpickselov.learning.tests;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class JUnitAssertFun {
	
	static String laDeeDah = "Well La Dee Dah!";
	static String phoneNum = "+1 (234) 567-8900";
	static String blah = "blah";
	
	@Test
	public void assertThatFun() {
		System.out.println("Well La Dee Dah!");
		assertThat(phoneNum, is("+1 (234) 567-8900"));
	}
	
	@Test
	public void assertThatToo() {
		assertThat("Well La Dee Dah!", is(laDeeDah));
	}

	@Test
	public void assertEqualsFun() {
		assertEquals("blah", blah);
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
	
	
	@Test
	public void ladeedah() {
		for (Integer i=0; i<10;i++) {
			arrowDivider(i);
			assertThatFun();
		}
	}

	@Test
	public void stupidPrint() {
		for (int i=0;i<50;i++){
			arrowDivider(i);
		}
		
	}
	
	private void arrowDivider(Integer i) {
		System.out.println(i + " - - - > ");
	}
}
