package Assignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonRBCA22103Test {

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
	    public void testPerson() {
	        // Create two instances of the Person class
		PersonRBCA22103 person1 = new PersonRBCA22103 ("Abdul", 20);
		PersonRBCA22103  person2 = new PersonRBCA22103 ("Atif", 45);

	        // Test the attributes of the first person
	        assertEquals("Abdul", person1.getName());
	        assertEquals(20, person1.getAge());

	        // Test the attributes of the second person
	        assertEquals("Atif", person2.getName());
	        assertEquals(45, person2.getAge());
}


	}


