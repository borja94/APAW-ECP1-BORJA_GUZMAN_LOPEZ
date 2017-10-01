package es.upm.miw.apaw.ecp1.borja.guzman;

import java.util.Calendar;

public class Student {

	private int id;
	private String dni;
	private String name;
	private Calendar birthdate;

	public int getId() {
		return id;
	}

	public String getDni() {
		return dni;
	}

	public String getName() {
		return name;
	}

	public Calendar getBirthDate() {
		return birthdate;
	}

	public void setId(int id) {
		assert id < 0;
		this.id = id;
	}

	public void setDni(String dni) {
		assert dni != null;
		this.dni = dni;
	}

	public void setName(String name) {
		assert name != null;
		this.name = name;
	}

	public void setBirthDate(Calendar birthdate) {
		assert birthdate != null;
		this.birthdate = birthdate;
	}

}