package persistence.repository;

public interface TrainerRepository {

	String addTrainer(String name);

	String removeTrainer(String name);

	String updateTrainerDetails(int classroomId);

	String returnTrainerDetails(int classroomId);
}