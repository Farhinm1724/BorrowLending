package com.system.BorrowingAndLendingSystem.classes;

import java.util.Date;

import javax.persistence.*;
@Entity
public class LendRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "lender_id")
    private User lender;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    private Date requestDate;
    private String status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getLender() {
		return lender;
	}
	public void setLender(User lender) {
		this.lender = lender;
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
	public LendRequest(Long id, User lender, Item item, Date requestDate, String status) {
		super();
		this.id = id;
		this.lender = lender;
		this.item = item;
		this.requestDate = requestDate;
		this.status = status;
	}
	public LendRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LendRequest [id=" + id + ", lender=" + lender + ", item=" + item + ", requestDate=" + requestDate
				+ ", status=" + status + "]";
	}
    
    

}