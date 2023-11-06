package com.system.BorrowingAndLendingSystem.classes;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String fullName;
    
  
    @OneToMany(mappedBy = "borrower")
    private List<Transaction> transactionsBorrowed;

    @OneToMany(mappedBy = "lender")
    private List<Transaction> transactionsLent;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public List<Transaction> getTransactionsBorrowed() {
		return transactionsBorrowed;
	}

	public void setTransactionsBorrowed(List<Transaction> transactionsBorrowed) {
		this.transactionsBorrowed = transactionsBorrowed;
	}

	public List<Transaction> getTransactionsLent() {
		return transactionsLent;
	}

	public void setTransactionsLent(List<Transaction> transactionsLent) {
		this.transactionsLent = transactionsLent;
	}

	public User(Long id, String username, String password, String fullName, List<Transaction> transactionsBorrowed,
			List<Transaction> transactionsLent) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.transactionsBorrowed = transactionsBorrowed;
		this.transactionsLent = transactionsLent;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", fullName=" + fullName + "]";
	}

    
}

