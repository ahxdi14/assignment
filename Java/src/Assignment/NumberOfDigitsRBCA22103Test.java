package Assignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NumberOfDigitsRBCA22103Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
		@Test
	    public void testCountDigitsForZero() {
			NumberOfDigitsRBCA22103 counter = new NumberOfDigitsRBCA22103 ();
	        int result = counter.countDigits(0);
	        assertEquals(1, result);
	    }

	    @Test
	    public void testCountDigitsForPositiveNumber() {
	    	NumberOfDigitsRBCA22103  counter = new NumberOfDigitsRBCA22103 ();
	        int result = counter.countDigits(12345);
	        assertEquals(5, result);
	    }

	    @Test
	    public void testCountDigitsForNegativeNumber() {
	    	NumberOfDigitsRBCA22103 counter = new NumberOfDigitsRBCA22103 ();
	        int result = counter.countDigits(-987);
	        assertEquals(3, result);
	    }
	{
}


	}


