package com.system.BorrowingAndLendingSystem.classes;

import java.util.Date;

import javax.persistence.*;
@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User recipient;

    private String message;
    private Date sentDate;
    private String type;
    private String status;
    
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getRecipient() {
		return recipient;
	}
	public void setRecipient(User recipient) {
		this.recipient = recipient;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getSentDate() {
		return sentDate;
	}
	public void setSentDate(Date sentDate) {
		this.sentDate = sentDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	public Notification(Long id, User recipient, String message, Date sentDate, String type, String status) {
		super();
		this.id = id;
		this.recipient = recipient;
		this.message = message;
		this.sentDate = sentDate;
		this.type = type;
		this.status = status;
	}
	public Notification() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Notification [id=" + id + ", recipient=" + recipient + ", message=" + message + ", sentDate=" + sentDate
				+ ", type=" + type + ", status=" + status + "]";
	}
	
    
	
    
}
