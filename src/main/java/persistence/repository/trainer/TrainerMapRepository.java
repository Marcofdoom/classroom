package persistence.repository.trainer;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.enterprise.inject.Alternative;
import javax.security.auth.x500.X500Principal;

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

	public String addTrainer(String jsonString) {
		Trainer trainer = jsonUtil.getObjectForJSON(jsonString, Trainer.class);
		trainerMap.put(trainer.getClassroomID(), trainer);
		return "Trainer added";
	}

	public String removeTrainer(String name) {
		
		// A bit bad
		int trainerId = -1;

		for (Map.Entry<Integer, Trainer> entry : trainerMap.entrySet()) {
			if (entry.getValue().getTrainer().equalsIgnoreCase(name)) {
				trainerId = entry.getValue().getClassroomID();
				break;
			}
		}

		if (trainerId != -1) {
			trainerMap.remove(trainerMap);
			return "Trainer removed";
		}

		return "No trainer exists";
	}

	public String updateTrainerDetails(String jsonString) {
		Trainer trainer = jsonUtil.getObjectForJSON(jsonString, Trainer.class);
		int trainerId = trainer.getClassroomID();

		if (trainerMap.containsKey(trainerId)) {
			trainerMap.replace(trainerId, trainer);
			return "Trainer updated";
		}

		return "Trainer id does not exist";

	}

	public String returnTrainerDetails(int classroomId) {

		if (trainerMap.containsKey(classroomId)) {
			Trainer trainer = trainerMap.get(classroomId);
			return jsonUtil.getJSONForObject(trainer);
		}

		return "No trainer exists";
	}

	public Map<Integer, Trainer> getTrainerMap() {
		return trainerMap;
	}
}