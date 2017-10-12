package Test;

import static org.junit.Assert.assertEquals;

import registrationSystem.student; 
import org.junit.Before;
import org.junit.Test;

public class StudentTest  {

	@Before
	public void setUp() throws Exception {
	}

	  @Test
	    public void testConcatenate() {
	   

	        String result = student.Concatenator("katie", "22");

	        assertEquals("katie22", result);

	    }
}
