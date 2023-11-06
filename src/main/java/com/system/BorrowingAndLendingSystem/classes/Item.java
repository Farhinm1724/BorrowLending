package com.system.BorrowingAndLendingSystem.classes;

import java.util.List;

import javax.persistence.*;
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemName;
    private String description;
    private String category;
    private String state;
    private Double value;


    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    @OneToMany(mappedBy = "item")
    private List<Transaction> transactions;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", description=" + description + ", category=" + category
				+ ", state=" + state + ", value=" + value + ", owner=" + owner + ", transactions=" + transactions + "]";
	}

	public Item(Long id, String itemName, String description, String category, String state, Double value, User owner,
			List<Transaction> transactions) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.description = description;
		this.category = category;
		this.state = state;
		this.value = value;
		this.owner = owner;
		this.transactions = transactions;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
    
}
