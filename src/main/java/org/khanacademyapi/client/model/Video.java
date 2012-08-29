package org.khanacademyapi.client.model;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

public class Video extends KhanAcademyCommon {
	private String id;
	@JsonProperty("date_added")
	private Date dateAdded;
	private String description;
	@JsonProperty("download_urls")
	private DownloadUrls downloadUrls;
	private int duration;
	@JsonProperty("extra_properties")
	private String extraProperties;
	@JsonProperty("ka_url")
	private String kaUrl;
	private String keywords;
	private String kind;
	private int position;
	@JsonProperty("readable_id")
	private String readableId;
	@JsonProperty("relative_url")
	private String relativeUrl;
	private String title;
	private String url;
	private long views;
	@JsonProperty("youtube_id")
	private String youtubeId;
	@JsonProperty("has_questions")
	private boolean hasQuestions;

	public boolean isHasQuestions() {
		return hasQuestions;
	}

	public void setHasQuestions(boolean hasQuestions) {
		this.hasQuestions = hasQuestions;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getExtraProperties() {
		return extraProperties;
	}

	public void setExtraProperties(String extraProperties) {
		this.extraProperties = extraProperties;
	}

	public String getKaUrl() {
		return kaUrl;
	}

	public void setKaUrl(String kaUrl) {
		this.kaUrl = kaUrl;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getReadableId() {
		return readableId;
	}

	public void setReadableId(String readableId) {
		this.readableId = readableId;
	}

	public String getRelativeUrl() {
		return relativeUrl;
	}

	public void setRelativeUrl(String relativeUrl) {
		this.relativeUrl = relativeUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public long getViews() {
		return views;
	}

	public void setViews(long views) {
		this.views = views;
	}

	public String getYoutubeId() {
		return youtubeId;
	}

	public void setYoutubeId(String youtubeId) {
		this.youtubeId = youtubeId;
	}

	public DownloadUrls getDownloadUrls() {
		return downloadUrls;
	}

	public void setDownloadUrls(DownloadUrls downloadUrls) {
		this.downloadUrls = downloadUrls;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static class DownloadUrls {
		private String png;
		private String mp4;
		private String m3u8;

		public String getPng() {
			return png;
		}

		public void setPng(String png) {
			this.png = png;
		}

		public String getMp4() {
			return mp4;
		}

		public void setMp4(String mp4) {
			this.mp4 = mp4;
		}

		public String getM3u8() {
			return m3u8;
		}

		public void setM3u8(String m3u8) {
			this.m3u8 = m3u8;
		}
	}
}
