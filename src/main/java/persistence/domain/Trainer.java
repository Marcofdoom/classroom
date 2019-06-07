package persistence.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Trainer {

	@Id
	private int classroomID;

	private String trainer;

	@OneToMany
	private List<Trainee> trainees;

	public Trainer() {

	}

	public Trainer(int classroomId, String name) {
		this.classroomID = classroomId;
		this.trainer = name;
	}

	public int getClassroomID() {
		return classroomID;
	}

	public String getTrainer() {
		return trainer;
	}
}