package persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Trainee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int traineeId;

	private String TraineeName;

	@ManyToOne
	private Trainer trainer;

	public Trainee() {

	}
}