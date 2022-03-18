package com.sebone.string.stringoperations.test;
import com.sebone.string.stringoperations.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void testGetReverseString() {
		ReverseString reverseString = new ReverseString();
        
		assertEquals("lkjihgfed", reverseString.getReverseString("defghijkl"));
		assertEquals("cba", reverseString.getReverseString("abc"));
		assertEquals("c", reverseString.getReverseString("c"));
		assertEquals("", reverseString.getReverseString(""));
	}

}
