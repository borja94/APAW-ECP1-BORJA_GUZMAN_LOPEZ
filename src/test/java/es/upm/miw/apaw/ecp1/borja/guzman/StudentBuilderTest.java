package es.upm.miw.apaw.ecp1.borja.guzman;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

public class StudentBuilderTest {

	@Test
	public void testStudentBuilder() {
		Subject subject = new SubjectBuilder(1).course(1).title("subejct1").build();
		Student student = new StudentBuilder(1).dni("00000000E").name("student1").birthdate(Calendar.getInstance())
				.subject(subject).build();
		assertEquals(1, student.getId());
		assertEquals("00000000E", student.getDni());
		assertEquals("student1", student.getName());
		assertEquals(subject, student.getSubject());
		
	}
}
