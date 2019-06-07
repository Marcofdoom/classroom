package persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import persistence.domain.Trainer;
import util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class TrainerDatabaseRepository implements TrainerRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager entityManager;

	@Inject
	private JSONUtil jsonUtil;

	@Transactional(REQUIRED)
	public String addTrainer(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(REQUIRED)
	public String removeTrainer(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateTrainerDetails(int classroomId) {
		// TODO Auto-generated method stub
		return null;
	}

	public String returnTrainerDetails(int classroomId) {
		return jsonUtil.getJSONForObject(entityManager.find(Trainer.class, classroomId));
	}
}