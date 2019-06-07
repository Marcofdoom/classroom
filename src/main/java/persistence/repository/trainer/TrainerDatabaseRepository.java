package persistence.repository.trainer;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
		Trainer trainer = jsonUtil.getObjectForJSON(name, Trainer.class);
		entityManager.persist(trainer);
		return "{\"message\": \"Trainer has been sucessfully added\"}";
	}

	@Transactional(REQUIRED)
	@Override
	public String removeTrainer(int classroomId) {
		if (entityManager.contains(entityManager.find(Trainer.class, classroomId))) {
			entityManager.remove(entityManager.find(Trainer.class, classroomId));
			return "{\"message\": \"movie sucessfully deleted\"}";
		}

		return "{\"message\": \"Cant find movie\"}";
	}

	@Override
	public String updateTrainerDetails(String name) {
		return null;
	}

	public String returnTrainerDetails(int classroomId) {
		return jsonUtil.getJSONForObject(entityManager.find(Trainer.class, classroomId));
	}

	@Override
	public String returnAllTrainerDetails() {
		Query query = entityManager.createQuery("SELECT a FROM Trainer a", Trainer.class);
		return jsonUtil.getJSONForObject(query.getResultList());
	}

}