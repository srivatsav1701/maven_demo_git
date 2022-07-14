package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;


//They provide Addtional support while executing the test cases based on asumtion.
// a failed asumtion results in test being terminated.
// when to use - if test case failed ... do not continue further
//100 lines - 10th line error we continue test and later slove the error.

class TestAssumptions {
	
	

	@Test
    void testOnDev()
    {
        System.setProperty("ENV", "DEV");
        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")), TestAssumptions::message);
        System.out.println(" continue execution");
    }

    @Test
    void testOnProd()
    {
        System.setProperty("ENV", "PROD");
        Assumptions.assumeFalse("PROD".equals(System.getProperty("ENV")),TestAssumptions::message);
        System.out.println(" don't continue execution");
    }

    private static String message () {
        return "TEST Execution Failed :: ";
    }

}
