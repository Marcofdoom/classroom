package business.service.trainer;

public interface TrainerService {

	String addTrainer(String jsonString);

	String removeTrainer(int classroomId);

	String updateTrainerDetails(int classroomId);

	String returnTrainerDetails(int classroomId);

	String returnAllTrainerDetails();
}