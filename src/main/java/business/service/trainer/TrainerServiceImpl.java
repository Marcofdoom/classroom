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
		return trainerRepository.addTrainer(jsonString);
	}

	public String removeTrainer(int classroomId) {
		return trainerRepository.removeTrainer(classroomId);
	}

	public String updateTrainerDetails(int classroomId) {
		return null;
	}

	public String returnTrainerDetails(int classroomId) {
		return trainerRepository.returnTrainerDetails(classroomId);
	}

	@Override
	public String returnAllTrainerDetails() {
		return trainerRepository.returnAllTrainerDetails();
	}
}