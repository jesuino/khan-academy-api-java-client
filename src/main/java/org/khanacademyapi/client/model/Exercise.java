package org.khanacademyapi.client.model;

import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class Exercise extends KhanAcademyCommon {
	@JsonProperty("creation_date")
	private Date creationDate;
	private String description;
	@JsonProperty("display_name")
	private String displayName;
	private String sha1;
	private List<String> tags;
	private List<String> covers;
	@JsonProperty("h_position")
	private int hPosition;
	@JsonProperty("relative_url")
	private String relativeUrl;
	private String kind;
	@JsonProperty("ka_url")
	private String kaUrl;
	@JsonProperty("file_name")
	private String fileName;
	@JsonProperty("pretty_display_name")
	private String prettyDisplayName;
	private boolean live;
	private String name;
	private List<String> prerequisites;
	@JsonProperty("related_video_readable_ids")
	private List<String> relatedVideoReadableIds;	
	@JsonProperty("seconds_per_fast_problem")
	private float secondsPerFastProblem;
	@JsonProperty("short_display_name")
	private String shortDisplayName;
	private boolean summative;
	@JsonProperty("v_position")
	private int vPosition;
	@JsonProperty("related_videos")
	private List<String> relatedVideos;

	public List<String> getCovers() {
		return covers;
	}

	public void setCovers(List<String> covers) {
		this.covers = covers;
	}

	public int gethPosition() {
		return hPosition;
	}

	public void sethPosition(int hPosition) {
		this.hPosition = hPosition;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getKaUrl() {
		return kaUrl;
	}

	public void setKaUrl(String kaUrl) {
		this.kaUrl = kaUrl;
	}

	public boolean isLive() {
		return live;
	}

	public void setLive(boolean live) {
		this.live = live;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPrerequisites() {
		return prerequisites;
	}

	public void setPrerequisites(List<String> prerequisites) {
		this.prerequisites = prerequisites;
	}

	public float getSecondsPerFastProblem() {
		return secondsPerFastProblem;
	}

	public void setSecondsPerFastProblem(float secondsPerFastProblem) {
		this.secondsPerFastProblem = secondsPerFastProblem;
	}

	public String getShortDisplayName() {
		return shortDisplayName;
	}

	public void setShortDisplayName(String shortDisplayName) {
		this.shortDisplayName = shortDisplayName;
	}

	public boolean isSummative() {
		return summative;
	}

	public void setSummative(boolean summative) {
		this.summative = summative;
	}

	public int getvPosition() {
		return vPosition;
	}

	public void setvPosition(int vPosition) {
		this.vPosition = vPosition;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getSha1() {
		return sha1;
	}

	public void setSha1(String sha1) {
		this.sha1 = sha1;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public String getRelativeUrl() {
		return relativeUrl;
	}

	public void setRelativeUrl(String relativeUrl) {
		this.relativeUrl = relativeUrl;
	}

	public List<String> getRelatedVideos() {
		return relatedVideos;
	}

	public void setRelatedVideos(List<String> relatedVideos) {
		this.relatedVideos = relatedVideos;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getPrettyDisplayName() {
		return prettyDisplayName;
	}

	public void setPrettyDisplayName(String prettyDisplayName) {
		this.prettyDisplayName = prettyDisplayName;
	}

	public List<String> getRelatedVideoReadableIds() {
		return relatedVideoReadableIds;
	}

	public void setRelatedVideoReadableIds(List<String> relatedVideoReadableIds) {
		this.relatedVideoReadableIds = relatedVideoReadableIds;
	}
}
