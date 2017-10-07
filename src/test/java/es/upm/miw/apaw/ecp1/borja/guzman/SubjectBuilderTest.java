package es.upm.miw.apaw.ecp1.borja.guzman;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.upm.miw.apaw.ecp1.borja.guzman.builder.SubjectBuilder;

public class SubjectBuilderTest {

	@Test
	public void testSubjectBuilder() {
		Subject subject = new SubjectBuilder(1).course(1).title("subject1").build();	
		assertEquals(1, subject.getId());
		assertEquals(1, subject.getCourse());
		assertEquals("subject1", subject.getTitle());
	}
}
