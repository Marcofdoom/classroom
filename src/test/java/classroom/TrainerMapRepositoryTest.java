package classroom;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import persistence.repository.trainer.TrainerMapRepository;
import util.Constants;
import util.JSONUtil;

public class TrainerMapRepositoryTest {

	private TrainerMapRepository trainerMapRepository;
	private JSONUtil jsonUtil;

	@Before
	public void setup() {
		trainerMapRepository = new TrainerMapRepository();
		jsonUtil = new JSONUtil();
	}

	@Test
	public void addTrainerTest() {
		trainerMapRepository.addTrainer(Constants.TRAINER_ONE);
		assertTrue(trainerMapRepository.getTrainerMap().size() == 1);
	}

	@Test
	public void removeSuccessTrainerTest() {
		trainerMapRepository.addTrainer(Constants.TRAINER_ONE);
		assertTrue(trainerMapRepository.removeTrainer(1).equalsIgnoreCase("Trainer removed"));
	}

	@Test
	public void removeFailTrainerTest() {
		assertTrue(trainerMapRepository.removeTrainer(1).equalsIgnoreCase("No trainer exists"));
	}

	@Test
	public void updateSuccessTrainerDetailsTest() {
		trainerMapRepository.addTrainer(Constants.TRAINER_ONE);
		assertTrue(trainerMapRepository.updateTrainerDetails(Constants.TRAINER_ONE_UPDATE)
				.equalsIgnoreCase("Trainer updated"));
	}

	@Test
	public void updateFailTrainerDetailsTest() {
		assertTrue(trainerMapRepository.updateTrainerDetails(Constants.TRAINER_ONE_UPDATE)
				.equalsIgnoreCase("Trainer id does not exist"));
	}

	@Test
	public void returnSuccessTrainerDetailsTest() {
		trainerMapRepository.addTrainer(Constants.TRAINER_ONE);
		assertTrue(trainerMapRepository.returnTrainerDetails(1).equals("{\"classroomID\":1,\"trainer\":\"Marc\"}"));
	}

	@Test
	public void returnFailTrainerDetailsTest() {
		trainerMapRepository.addTrainer(Constants.TRAINER_ONE);
		assertTrue(trainerMapRepository.returnTrainerDetails(2).equals("No trainer exists"));
	}
}