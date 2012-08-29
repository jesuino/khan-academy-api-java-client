package org.khanacademyapi.client.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 
 * This is the object with common Khan academy attributes
 * 
 * @author William Antônio
 * 
 */
public class KhanAcademyCommon {

	/**
	 * As the REST API is evolving very fast, we will try to print the new
	 * fields for future mapping
	 */
	private List<String> newFields = new ArrayList<String>();

	@JsonProperty("backup_timestamp")
	private Date backupTimestamp;

	public Date getBackupTimestamp() {
		return backupTimestamp;
	}

	public void setBackupTimestamp(Date backupTimestamp) {
		this.backupTimestamp = backupTimestamp;
	}

	@JsonAnySetter
	protected void handleUnknown(String key, Object value) {

		if (!newFields.contains(key + value)) {
			// for new fields
			System.out.println("New field added to the API: \"" + key
					+ "\" for class: " + this.getClass().getCanonicalName());
			newFields.add(key + value);
		}

	}

}
