package org.khanacademyapi.client.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.khanacademyapi.client.model.Exercise;
import org.khanacademyapi.client.model.Playlist;
import org.khanacademyapi.client.model.Video;

/**
 * The Playlist resources
 * 
 * @author William Antônio
 * 
 */
@Path("playlists")
public interface PlaylistResource{

	/**
	 * Retrieve a list of all playlists in the library
	 */
	@GET
	public List<Playlist> getAllPlaylists();

	/**
	 * Retrieve a list of all videos in the playlist identified by
	 * <playlist_title>
	 */
	@Path("{playlist}/videos")
	@GET
	public List<Video> getAllVideosByPlaylist(
			@PathParam("playlist") String playlist);

	/**
	 * Retrieve a list of all exercises associated with any videos in the
	 * playlist identified by <playlist_title>
	 * 
	 * */
	@Path("{playlist}/exercises")
	@GET
	public List<Exercise> getAllExerciseByPlaylist(
			@PathParam("playlist") String playlist);

}
