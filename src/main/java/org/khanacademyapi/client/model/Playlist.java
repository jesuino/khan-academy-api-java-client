package org.khanacademyapi.client.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class Playlist extends KhanAcademyCommon {
	private String description;
	@JsonProperty("extended_slug")
	private String extendedSlug;
	private boolean hide;
	@JsonProperty("ka_url")
	private String kaUrl;
	private String kind;
	@JsonProperty("relative_url")
	private String relativeUrl;
	@JsonProperty("standalone_title")
	private String standaloneTitle;
	private String[] tags;
	private String title;
	@JsonProperty("topic_page_url")
	private String topicPageUrl;
	private String id;
	/**
	 * videos may be null!
	 */
	private List<Video> videos;
	@JsonProperty("community_questions_title")
	private String communityQuestionsTitle;
	@JsonProperty("community_questions_url")
	private String communityQuestionsUrl;
	@JsonProperty("init_custom_stack")
	private String initCustomStack;

	public String getCommunityQuestionsTitle() {
		return communityQuestionsTitle;
	}

	public void setCommunityQuestionsTitle(String communityQuestionsTitle) {
		this.communityQuestionsTitle = communityQuestionsTitle;
	}

	public String getCommunityQuestionsUrl() {
		return communityQuestionsUrl;
	}

	public void setCommunityQuestionsUrl(String communityQuestionsUrl) {
		this.communityQuestionsUrl = communityQuestionsUrl;
	}

	public String getInitCustomStack() {
		return initCustomStack;
	}

	public void setInitCustomStack(String initCustomStack) {
		this.initCustomStack = initCustomStack;
	}

	public String getDescription() {
		return description;
	}

	public String getExtendedSlug() {
		return extendedSlug;
	}

	public void setExtendedSlug(String extendedSlug) {
		this.extendedSlug = extendedSlug;
	}

	public boolean isHide() {
		return hide;
	}

	public void setHide(boolean hide) {
		this.hide = hide;
	}

	public String getKaUrl() {
		return kaUrl;
	}

	public void setKaUrl(String kaUrl) {
		this.kaUrl = kaUrl;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getRelativeUrl() {
		return relativeUrl;
	}

	public void setRelativeUrl(String relativeUrl) {
		this.relativeUrl = relativeUrl;
	}

	public String getStandaloneTitle() {
		return standaloneTitle;
	}

	public void setStandaloneTitle(String standaloneTitle) {
		this.standaloneTitle = standaloneTitle;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTopicPageUrl() {
		return topicPageUrl;
	}

	public void setTopicPageUrl(String topicPageUrl) {
		this.topicPageUrl = topicPageUrl;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Video> getVideos() {
		return videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}
}