package persistence.repository.trainer;

public interface TrainerRepository {

	String addTrainer(String name);

	String removeTrainer(String name);

	String updateTrainerDetails(String name);

	String returnTrainerDetails(int classroomId);
}