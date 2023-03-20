package ph.com.alliance.jpa.functions.ticket.model;

import java.util.Date;

public class TicketModel {
	
	private Integer ticketID;
	private Integer hrID;
	private Integer employeeID;
	private String type;
	private String attribute;
	private String file_attachment;
	private String issue;
	private Date create_at;
	private String importance;
	
	public Integer getTicketID() {
		return ticketID;
	}

	public void setTicketID(Integer ticketID) {
		this.ticketID = ticketID;
	}

	public Integer getHrID() {
		return hrID;
	}

	public void setHrID(Integer hrID) {
		this.hrID = hrID;
	}

	public Integer getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getFile_attachment() {
		return file_attachment;
	}

	public void setFile_attachment(String file_attachment) {
		this.file_attachment = file_attachment;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public Date getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}

	public String getImportance() {
		return importance;
	}

	public void setImportance(String importance) {
		this.importance = importance;
	}

	
	

}
