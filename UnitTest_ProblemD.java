package com.codility.unittestcases;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

import com.codility.startup.Solutions;

public class UnitTest_ProblemD {

	@Test
	public void testMain() {
		fail("Not yet implemented");
		Solutions sol = new Solutions();
		String[] args = {"Test"};
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		try{
			sol.main(args);

        assertEquals("Unit test Result", outContent.toString());
		}catch(Exception e){
			System.out.println("Exception:::"+e);
		}
        
	}

}
