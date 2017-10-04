package es.upm.miw.apaw.ecp1.borja.guzman.composite;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.apaw.ecp1.borja.guzman.Student;
import es.upm.miw.apaw.ecp1.borja.guzman.StudentBuilder;
import es.upm.miw.apaw.ecp1.borja.guzman.Subject;
import es.upm.miw.apaw.ecp1.borja.guzman.SubjectBuilder;

public class StudentCompositeTest {

	private StudentComponent studentComponent;

	@Before
	public void before() {
		
		Subject subject = new SubjectBuilder(1).course(1).title("subejct1").build();
		
		Student student = new StudentBuilder(1).dni("00000000E").name("student1").birthdate(Calendar.getInstance())
				.subject(subject).build();
		Student student1 = new StudentBuilder(2).dni("00000000E").name("student1").birthdate(Calendar.getInstance())
				.subject(subject).build();
		Student student2 = new StudentBuilder(3).dni("00000000E").name("student1").birthdate(Calendar.getInstance())
				.subject(subject).build();
		
		studentComponent = new StudentComposite("root");
		StudentComponent studentComponentAux = new StudentComposite("group1");
		studentComponent.add(new StudentLeaf(student));
		studentComponentAux.add(new StudentLeaf(student1));
		studentComponentAux.add(new StudentLeaf(student2));
		studentComponent.add(studentComponentAux);
	}
	
	@Test
	public void ViewTest() {
		assertEquals("root_1_group1_2_3",studentComponent.view());
	}
	

}
