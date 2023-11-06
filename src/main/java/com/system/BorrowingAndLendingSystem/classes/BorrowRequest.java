package com.system.BorrowingAndLendingSystem.classes;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Entity

public class BorrowRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "borrower_id")
    private User borrower;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;
    
    @Temporal(TemporalType.DATE) 
    private Date requestDate;
    private String status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getBorrower() {
		return borrower;
	}
	public void setBorrower(User borrower) {
		this.borrower = borrower;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Date getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public BorrowRequest(Long id, User borrower, Item item, Date requestDate, String status) {
		super();
		this.id = id;
		this.borrower = borrower;
		this.item = item;
		this.requestDate = requestDate;
		this.status = status;
	}
	public BorrowRequest() {
		super();
	}
	public String toString() {
		return "BorrowRequest [id=" + id + ", borrower=" + borrower + ", item=" + item + ", requestDate=" + requestDate
				+ ", status=" + status + "]";
	}


}
