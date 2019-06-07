package persistence.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Trainer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int classroomID;

	private String trainer;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "trainer", cascade = CascadeType.ALL)
	private Set<Trainee> trainees;

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

	public Set<Trainee> getTrainees() {
		return trainees;
	}
}