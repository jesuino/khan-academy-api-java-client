package org.khanacademyapi.client.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.khanacademyapi.client.KhanAcademyClient;
import org.khanacademyapi.client.model.Exercise;
import org.khanacademyapi.client.model.Playlist;
import org.khanacademyapi.client.model.Video;

/**
 * 
 * Test all the simple Khan Academy API Methods It may take a while to finish
 * since it will perform a few HTTP requests
 * 
 * @author William Antônio
 * 
 */
public class GeneralTest {

	/*
	 * Global Variables
	 */

	KhanAcademyClient client;

	/**
	 * Calculus Playlist
	 */
	private int CALCULUS_SIZE = 95;
	private int CALCULUS_TOTAL_VIDEOS = 185;
	private int CALCULUS_TOTAL_EXERCISES = 10;
	private int TOTAL_EXERCISES = 345;
	private int SUBSTRACTION_FOLLOW_UP_TOTAL = 2;

	@Before
	public void createClient() {
		System.out.println("Before!");
		System.out.println(""+client);
		client = new KhanAcademyClient();
	}

	/**
	 * Some tests with Playlist. If the test fail, check the size of the
	 * playlist TODO: Remove all harcode from tests
	 */
	@Test
	public void testPlayList() {
		List<Playlist> allPlayList = client.allPlaylists();
		assertNotNull(allPlayList);
		// use the size of the list of playlists pass the test below
		System.out.println("Calculus Playlist size is: " + allPlayList.size());
		assertNull(allPlayList.get(0).getVideos());
		assertEquals(CALCULUS_SIZE, allPlayList.size());
	}

	@Test
	public void testVideoPlaylist() {
		List<Video> videosFromCalculusPlaylist = client
				.videosByPlaylist("Calculus");
		assertNotNull(videosFromCalculusPlaylist);
		// use the size of the list of videos to pass the test below
		System.out.println("Calculus has " + videosFromCalculusPlaylist.size()
				+ " videos");
		assertEquals(CALCULUS_TOTAL_VIDEOS, videosFromCalculusPlaylist.size());
	}

	@Test
	public void testExercisePlaylist() {
		List<Exercise> exercisesFromCalculusPlaylist = client
				.exercisesByPlaylist("Calculus");
		assertNotNull(exercisesFromCalculusPlaylist);
		// use the size of the list of exercises to pass the test below
		System.out.println("Calculus has "
				+ exercisesFromCalculusPlaylist.size() + " exercises");
		assertEquals(CALCULUS_TOTAL_EXERCISES,
				exercisesFromCalculusPlaylist.size());
	}

	@Test
	public void testVideoByYoutubeId() {
		Video video = client.videoByYoutubeId("jxA8MffVmPs");
		assertNotNull(video);
		assertEquals(145, video.getDuration());
		System.out.println(video.getTitle());
		assertEquals(video.getTitle(), "Place Value 1");
	}

	@Test
	public void testExerciseByVideo() {
		List<Exercise> exercisesByVideo = client
				.exercisesByVideoId("jxA8MffVmPs");
		assertNotNull(exercisesByVideo);
		// use the size of the list of exercises to pass the test below
		assertEquals(1, exercisesByVideo.size());
	}

	@Test
	public void testAllExercises() {
		List<Exercise> allExercises = client.allExercises();
		assertNotNull(allExercises);
		// use the size of the list of exercises to pass the test below
		System.out.println("Khan Academy has " + allExercises.size()
				+ " exercises");
		assertEquals(TOTAL_EXERCISES, allExercises.size());
	}

	@Test
	public void testExerciseByName() {
		Exercise exercise = client.exerciseByName("logarithms_1");
		assertNotNull(exercise);
		System.out.println(exercise.getDisplayName());
		assertEquals("logarithms_1", exercise.getName());
	}

	@Test
	public void testFollowupExercises() {
		List<Exercise> subtractionFollowupExercises = client
				.followupExercises("subtraction_1");
		assertNotNull(subtractionFollowupExercises);
		// use the size of the list of exercises to pass the test below
		System.out
				.println("Number of follow up exercises from Substraction Exercise: "
						+ subtractionFollowupExercises.size());
		assertEquals(SUBSTRACTION_FOLLOW_UP_TOTAL,
				subtractionFollowupExercises.size());
	}

	@Test
	public void testVideoExercise() {
		List<Video> videosFromSubtraction1Exercise = client
				.videosByExercise("subtraction_1");
		assertNotNull(videosFromSubtraction1Exercise);
		// use the size of the list of videos to pass the test below
		System.out.println(videosFromSubtraction1Exercise.size());
		assertEquals(1, videosFromSubtraction1Exercise.size());
	}
}
