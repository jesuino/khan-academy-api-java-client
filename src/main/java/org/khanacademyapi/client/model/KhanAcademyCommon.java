package org.khanacademyapi.client.model;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 
 * This is the object with common Khan academy attributes 
 * @author William Antônio
 *
 */
public class KhanAcademyCommon {
	@JsonProperty("backup_timestamp")
	private Date backupTimestamp;

	public Date getBackupTimestamp() {
		return backupTimestamp;
	}

	public void setBackupTimestamp(Date backupTimestamp) {
		this.backupTimestamp = backupTimestamp;
	}
	
	

}
