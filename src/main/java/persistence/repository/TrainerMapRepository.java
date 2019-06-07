package persistence.repository;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.Alternative;

import persistence.domain.Trainer;
import util.JSONUtil;

@Alternative
public class TrainerMapRepository implements TrainerRepository {

	private Map<Integer, Trainer> trainerMap;
	private JSONUtil jsonUtil;

	public TrainerMapRepository() {
		trainerMap = new HashMap<Integer, Trainer>();
		jsonUtil = new JSONUtil();
	}

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