package business.service;

import javax.inject.Inject;

import persistence.repository.TrainerRepository;
import util.JSONUtil;

public class TrainerServiceImpl implements TrainerService {

	@Inject
	private TrainerRepository trainerRepository;

	@Inject
	private JSONUtil util;

	public String addTrainer(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public String removeTrainer(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateTrainerDetails(int classroomId) {
		// TODO Auto-generated method stub
		return null;
	}

	public String returnTrainerDetails(int classroomId) {
		// TODO Auto-generated method stub
		return null;
	}

}
