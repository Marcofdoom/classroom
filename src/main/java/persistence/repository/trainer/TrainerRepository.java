package persistence.repository.trainer;

public interface TrainerRepository {

	String addTrainer(String name);

	String removeTrainer(int classroomId);

	String updateTrainerDetails(String name);

	String returnTrainerDetails(int classroomId);

	String returnAllTrainerDetails();
}