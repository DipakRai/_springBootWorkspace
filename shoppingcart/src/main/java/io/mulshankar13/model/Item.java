package io.mulshankar13.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="ITEM")
@Table(name="ITEM")
public class Item implements Serializable {

	private static final long serialVersionUID = 4998189726459489298L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	public Item() {
	}

	public Item(String name, long price, long discount) {
		super();
		this.name = name;
		this.price = price;
		this.discount = discount;
	}

	@Column(name = "name")
	private String name;

	@Column(name = "price")
	private long price;

	@Column(name = "discount")
	private long discount;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public long getDiscount() {
		return discount;
	}

	public void setDiscount(long discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", discount=" + discount + "]";
	}
}