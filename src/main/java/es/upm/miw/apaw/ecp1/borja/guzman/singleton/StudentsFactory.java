package es.upm.miw.apaw.ecp1.borja.guzman.singleton;

import java.util.HashMap;
import java.util.Map;

import es.upm.miw.apaw.ecp1.borja.guzman.Student;

public class StudentsFactory {

	private Map<Integer, Student> studentsCollection;
	private static StudentsFactory instance;

	private StudentsFactory() {
		studentsCollection = new HashMap<Integer, Student>();
	}

	public static StudentsFactory getStudentsFacoty() {
		if (instance == null)
			instance = new StudentsFactory();
		return instance;
	}

	public Student getStudent(int id) {
		assert id < 0;
		return studentsCollection.get(id);
	}

	public void setStudent(Student student) {
		assert student == null;
		studentsCollection.put(student.getId(), student);
	}
}
