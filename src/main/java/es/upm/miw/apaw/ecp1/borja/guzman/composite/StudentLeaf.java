package es.upm.miw.apaw.ecp1.borja.guzman.composite;

import es.upm.miw.apaw.ecp1.borja.guzman.Student;

public class StudentLeaf extends StudentComponent {

	private Student student;

	public StudentLeaf(Student student) {
		assert student != null;
		this.student = student;
	}

	@Override
	public String view() {
		System.out.println("Id:" + student.getId());
		return (new StringBuilder()).append(student.getId()).toString();
	}

	@Override
	public void add(StudentComponent studentComponent) {
		// Do nothing because is leaf
	}

	@Override
	public void remove(StudentComponent studentComponent) {
		// Do nothing because is leaf
	}

}
