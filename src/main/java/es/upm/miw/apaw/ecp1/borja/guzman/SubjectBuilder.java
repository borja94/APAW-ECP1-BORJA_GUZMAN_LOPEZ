package es.upm.miw.apaw.ecp1.borja.guzman;

public class SubjectBuilder {

	private Subject subject;

	public SubjectBuilder(int id) {
		subject = new Subject(id);
	}

	public SubjectBuilder course(int course) {
		this.subject.setCourse(course);
		return this;
	}

	public SubjectBuilder title(String title) {
		this.subject.setTitle(title);
		return this;
	}

	public Subject build() {
		return this.subject;
	}
}
