package es.upm.miw.apaw.ecp1.borja.guzman.composite;

import java.util.ArrayList;
import java.util.List;

public class StudentComposite extends StudentComponent {

	private String name;
	private List<StudentComponent> studentComponentList;

	public StudentComposite(String name) {
		this.name = name;
		studentComponentList = new ArrayList<StudentComponent>();
	}

	@Override
	public String view() {
		String result = this.name;
		System.out.println("Inicio del grupo: " + name);
		for (StudentComponent student : studentComponentList) {
			result= result + "_"+ student.view();
		}
		System.out.println("Fin del grupo: " + name);
		return result;
	}

	@Override
	public void add(StudentComponent studentComponent) {
		this.studentComponentList.add(studentComponent);
	}

	@Override
	public void remove(StudentComponent studentComponent) {
		this.studentComponentList.remove(studentComponent);
	}
}
