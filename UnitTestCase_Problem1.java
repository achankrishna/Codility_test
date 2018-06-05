package com.codility.unittestcases;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

import com.codility.startup.*;
import org.junit.Test;

public class UnitTestCase_Problem1 {

	@Test
	public void testMain() {
		fail("Not yet implemented");
		Solutions sol = new Solutions();
		String[] args = {"Test"};
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        sol.main(args);

        assertEquals("Unit test Result", outContent.toString());
	}

}
