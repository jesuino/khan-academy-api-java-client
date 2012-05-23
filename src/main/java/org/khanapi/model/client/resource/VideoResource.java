package org.khanapi.model.client.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.khanacademyapi.client.model.Exercise;
import org.khanacademyapi.client.model.Video;

/**
 * Video Resource
 * 
 * @author William Antônio
 * 
 */
@Path("videos")
public interface VideoResource {
	/**
	 * Retrieve the video identified by <youtube_id>
	 */
	@Path("{videoId}")
	@GET
	public Video getVideoByYoutubeID(@PathParam("videoId") String videoId);

	/**
	 * Retrieve a list of all exercises associated with video identified by
	 * <youtube_id>
	 */
	@Path("{videoId}/exercises")
	@GET
	public List<Exercise> getExercisesByVideoId(
			@PathParam("videoId") String videoId);

	/**
	 * Retrieve a list of all exercises in the library
	 */
	@Path("exercises")
	@GET
	public List<Exercise> allExercises();

}
