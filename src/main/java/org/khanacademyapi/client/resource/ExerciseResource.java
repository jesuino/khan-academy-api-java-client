package org.khanacademyapi.client.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.khanacademyapi.client.model.Exercise;
import org.khanacademyapi.client.model.Video;

/**
 * Our Exercise resource
 * 
 * @author William Antônio
 * 
 */
@Path("exercises")
public interface ExerciseResource {
	/**
	 * Retrieve a list of all exercises in the library
	 */
	@GET
	public List<Exercise> getAllExercises();

	/**
	 * Retrieve exercise identified by <exercise_name>
	 */
	@Path("{name}")
	@GET
	public Exercise getExerciseByName(@PathParam("name") String name);

	/**
	 * Retrieve an array of all the exercises that list <exercise_name> as a
	 * prerequisite.
	 */
	@Path("{exerciseName}/followup_exercises")
	@GET
	public List<Exercise> getFollowupExercises(
			@PathParam("exerciseName") String exerciseName);

	/**
	 * Retrieve a list of all videos associated with exercise identified by
	 * <exercise_name>
	 */
	@Path("{exerciseName}/videos")
	@GET
	public List<Video> getVideosByExercise(
			@PathParam("exerciseName") String exerciseName);;

}
