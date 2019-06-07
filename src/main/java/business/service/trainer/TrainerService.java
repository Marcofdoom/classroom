package business.service.trainer;

public interface TrainerService {

	String addTrainer(String jsonString);

	String removeTrainer(String jsonString);

	String updateTrainerDetails(int classroomId);

	String returnTrainerDetails(int classroomId);
}