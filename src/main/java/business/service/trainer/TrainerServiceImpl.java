package business.service.trainer;

import javax.inject.Inject;

import persistence.repository.trainer.TrainerRepository;
import util.JSONUtil;

public class TrainerServiceImpl implements TrainerService {

	@Inject
	private TrainerRepository trainerRepository;

	@Inject
	private JSONUtil util;

	public String addTrainer(String jsonString) {
		return null;
	}

	public String removeTrainer(String jsonString) {
		return null;
	}

	public String updateTrainerDetails(int classroomId) {
		return null;
	}

	public String returnTrainerDetails(int classroomId) {
		return trainerRepository.returnTrainerDetails(classroomId);
	}
}