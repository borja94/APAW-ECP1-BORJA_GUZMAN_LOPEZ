package es.upm.miw.apaw.ecp1.borja.guzman;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import java.util.Calendar;

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
	    
	    public void testStudentsFactory() {
	    	Subject subject = new Subject(1,1,"subject1");
	    	Student student = new Student(1,"00000000A","student1",Calendar.getInstance(),subject);
	    	StudentsFactory.getStudentsFacoty().setStudent(student);
	    	StudentsFactory.getStudentsFacoty().getStudent(1);
	    }

}
