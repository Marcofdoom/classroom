package persistence.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainer {

	@Id
	private int classroomID;

	private String trainer;

	// TODO create an array of Trainees

	public Trainer() {

	}
}