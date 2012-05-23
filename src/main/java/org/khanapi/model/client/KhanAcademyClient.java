package org.khanapi.model.client;

import java.net.URI;
import java.util.List;

import javax.ws.rs.core.UriBuilder;

import org.jboss.resteasy.annotations.interception.Precedence;
import org.jboss.resteasy.client.ClientExecutor;
import org.jboss.resteasy.client.ClientRequestFactory;
import org.jboss.resteasy.client.ClientResponse;
import org.jboss.resteasy.client.ProxyConfig;
import org.jboss.resteasy.client.ProxyFactory;
import org.jboss.resteasy.client.cache.CacheFactory;
import org.jboss.resteasy.client.core.ClientInterceptorRepositoryImpl;
import org.jboss.resteasy.client.core.executors.ApacheHttpClient4Executor;
import org.jboss.resteasy.spi.ResteasyProviderFactory;
import org.jboss.resteasy.spi.interception.ClientExecutionContext;
import org.jboss.resteasy.spi.interception.ClientExecutionInterceptor;
import org.khanacademyapi.client.model.Exercise;
import org.khanacademyapi.client.model.Playlist;
import org.khanacademyapi.client.model.Video;
import org.khanapi.model.client.resource.ExerciseResource;
import org.khanapi.model.client.resource.PlaylistResource;
import org.khanapi.model.client.resource.VideoResource;

/**
 * The client for Khan Academy API<br>
 * For more information about each method used here see
 * https://github.com/Khan/khan-api/wiki/Khan-Academy-API-Methods
 * 
 * @author William Antônio
 * 
 */
public class KhanAcademyClient implements ClientExecutionInterceptor {

	/**
	 * The API Base URL
	 */
	private final String API_BASE_URL = "http://www.khanacademy.org/api/v1";

	private final PlaylistResource playlistResource;
	private final VideoResource videoResource;
	private final ExerciseResource exerciseResource;

	/**
	 * It will instantiate all the proxies we will use in our client
	 */
	public KhanAcademyClient() {

		ClientRequestFactory crf = new ClientRequestFactory(
				URI.create(API_BASE_URL));
		crf.getPrefixInterceptors().getExecutionInterceptorList().add(this);
		playlistResource = crf.createProxy(PlaylistResource.class);
		videoResource = crf.createProxy(VideoResource.class);
		exerciseResource = crf.createProxy(ExerciseResource.class);

		// cache for all requests (is it necessary? will it work?)
		CacheFactory.makeCacheable(playlistResource);
		CacheFactory.makeCacheable(videoResource);
		CacheFactory.makeCacheable(exerciseResource);

	}

	/**
	 * Return all the Khan Academy playlists.
	 * 
	 * @return an List object with all playlists available
	 */
	public List<Playlist> allPlaylists() {
		return playlistResource.getAllPlaylists();
	}

	public List<Video> videosByPlaylist(String playlist) {
		return playlistResource.getAllVideosByPlaylist(playlist);
	}

	public List<Exercise> exercisesByPlaylist(String playlist) {
		return playlistResource.getAllExerciseByPlaylist(playlist);
	}

	public Video videoByYoutubeId(String videoId) {
		return videoResource.getVideoByYoutubeID(videoId);
	}

	public List<Exercise> exercisesByVideoId(String videoId) {
		return videoResource.getExercisesByVideoId(videoId);
	}

	public List<Exercise> allExercises() {
		return exerciseResource.getAllExercises();
	}

	public Exercise exerciseByName(String name) {
		return exerciseResource.getExerciseByName(name);
	}

	public List<Exercise> followupExercises(String exerciseName) {
		return exerciseResource.getFollowupExercises(exerciseName);
	}

	public List<Video> videosByExercise(String exerciseName) {
		return exerciseResource.getVideosByExercise(exerciseName);
	}

	/*
	 * 
	 * This method will Log all requests done by this clientTODO: USe logging
	 * instead sysout
	 * 
	 * @see
	 * org.jboss.resteasy.spi.interception.ClientExecutionInterceptor#execute
	 * (org.jboss.resteasy.spi.interception.ClientExecutionContext)
	 */
	public ClientResponse<?> execute(ClientExecutionContext ctx)
			throws Exception {

		System.out.println(" >> Starting execution of method "
				+ ctx.getRequest().getHttpMethod() + " in URL "
				+ ctx.getRequest().getUri());
		long start = System.currentTimeMillis();
		ClientResponse<?> c = ctx.proceed();
		long end = System.currentTimeMillis();
		System.out.println(" << Ending execution of method "
				+ ctx.getRequest().getHttpMethod() + " in URL "
				+ ctx.getRequest().getUri());
		System.out.println("Total time: " + (end - start) + "ms");
		return c;

	}
}
