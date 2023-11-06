package com.system.BorrowingAndLendingSystem.classes;

import javax.persistence.*;
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User reviewedUser;

    private String comment;
    private int rating;
    private User reviewer;

	
	public User getReviewer() {
		return reviewer;
	}
	public void setReviewer(User reviewer) {
		this.reviewer = reviewer;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getReviewedUser() {
		return reviewedUser;
	}
	public void setReviewedUser(User reviewedUser) {
		this.reviewedUser = reviewedUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Review(Long id, User reviewedUser, String comment, int rating, User reviewer) {
		super();
		this.id = id;
		this.reviewedUser = reviewedUser;
		this.comment = comment;
		this.rating = rating;
		this.reviewer = reviewer;
	}
	
	@Override
	public String toString() {
		return "Review [id=" + id + ", reviewedUser=" + reviewedUser + ", comment=" + comment + ", rating=" + rating
				+ ", reviewer=" + reviewer + "]";
	}
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}