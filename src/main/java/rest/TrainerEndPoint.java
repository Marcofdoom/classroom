package rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import business.service.trainer.TrainerService;

@Path("/trainer")
public class TrainerEndPoint {

	@Inject
	private TrainerService trainerService;

	@Path("/getTrainer/{id}")
	@GET
	@Produces({ "application/json" })
	public String getTrainer(@PathParam("id") int classroomId) {
		return trainerService.returnTrainerDetails(classroomId);
	}

	@Path("/removeTrainer/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String removeTrainer(@PathParam("id") int classroomId) {
		return trainerService.removeTrainer(classroomId);
	}

	@Path("/getAllTrainers")
	@GET
	@Produces({ "application/json" })
	public String getAllTrainers() {
		return trainerService.returnAllTrainerDetails();
	}

	@Path("/createTrainer")
	@POST
	@Produces({ "application/json" })
	public String createTrainer(String jsonString) {
		return trainerService.addTrainer(jsonString);
	}
}