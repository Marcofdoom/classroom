package persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int classroomID;

	private String trainer;

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