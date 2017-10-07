package es.upm.miw.apaw.ecp1.borja.guzman.builder;

import java.util.Calendar;

import es.upm.miw.apaw.ecp1.borja.guzman.Student;
import es.upm.miw.apaw.ecp1.borja.guzman.Subject;

public class StudentBuilder {

	private Student student;

	public StudentBuilder(int id) {
		assert id > 0;
		student = new Student(id);
	}

	public StudentBuilder dni(String dni) {
		assert dni != null;
		this.student.setDni(dni);
		return this;
	}

	public StudentBuilder name(String name) {
		assert name != null;
		this.student.setName(name);
		return this;
	}

	public StudentBuilder birthdate(Calendar birthdate) {
		assert birthdate != null;
		this.student.setBirthDate(birthdate);
		return this;
	}

	public StudentBuilder subject(Subject subject) {
		assert subject != null;
		this.student.setSubject(subject);
		return this;
	}

	public Student build() {
		return this.student;
	}

}
