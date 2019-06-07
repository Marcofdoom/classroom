package persistence.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Trainee {

	@Id
	private int traineeId;

	private String TraineeName;

	public Trainee() {

	}
}