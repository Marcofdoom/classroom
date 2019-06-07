package business.service;

public interface TrainerService {

	String addTrainer(String name);

	String removeTrainer(String name);

	String updateTrainerDetails(int classroomId);

	String returnTrainerDetails(int classroomId);
}