package es.upm.miw.apaw.ecp1.borja.guzman;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;


public class StudentsFactoryTest {

	 @Test
	    public void testIsStudentsFactory() {
	        assertSame(StudentsFactory.getStudentsFacoty(), StudentsFactory.getStudentsFacoty());
	    }
	    
	    @Test
	    public void testStudentsFactoryNotNull() {
	        assertNotNull(StudentsFactory.getStudentsFacoty());
	    }

}
