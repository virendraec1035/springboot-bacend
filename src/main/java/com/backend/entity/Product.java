package com.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity        // @Entity used to mapped  a class to table 
@Table(name= "products")
	public class Product {
	@Override
	public String toString() {
		return "Product [id=" + id + ", prod_name=" + prod_name + ", quantity=" + quantity + ", description="
				+ description + ", Price=" + Price + ", imageUrl=" + imageUrl + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")        // specify the mapped column for a persistent property
	private long id;
	
	@Column(name="product_name")
	private String prod_name;
	
	@Column(name="quantity")
	private Integer quantity;
	
	@Column(name="description")
	private String description;
	
	@Column(name="price")
	private String Price;
	
	@Column(name="image_url")
	private String imageUrl;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Product(long id, String prod_name, Integer quantity, String description, String price, String imageUrl) {
		super();
		this.id = id;
		this.prod_name = prod_name;
		this.quantity = quantity;
		this.description = description;
		Price = price;
		this.imageUrl = imageUrl;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	}

