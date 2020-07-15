package com.notification.csv.CSVReader.Response;

public class CsvContentResponse {

	private String User;
	private String Date;
	private String BusinessEntity;
	private String Status;
	private String TimeAvailability;

	public String getUser() {
		return User;
	}

	public void setUser(String user) {
		User = user;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getBusinessEntity() {
		return BusinessEntity;
	}

	public void setBusinessEntity(String businessEntity) {
		BusinessEntity = businessEntity;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getTimeAvailability() {
		return TimeAvailability;
	}

	public void setTimeAvailability(String timeAvailability) {
		TimeAvailability = timeAvailability;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public String getAuditTimeStamp() {
		return AuditTimeStamp;
	}

	public void setAuditTimeStamp(String auditTimeStamp) {
		AuditTimeStamp = auditTimeStamp;
	}

	private String Message;
	private String AuditTimeStamp;
}
