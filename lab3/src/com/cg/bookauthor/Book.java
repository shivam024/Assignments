package com.cg.bookauthor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BookTable")
public class Book implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private int id;

	private String name;

	private double price;

	@ManyToMany(fetch=FetchType.LAZY, mappedBy = "products")
	private Set<Author> orders = new HashSet<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Set<Author> getOrders() {
		return orders;
	}

	public void setOrders(Set<Author> orders) {
		this.orders = orders;
	}

}
