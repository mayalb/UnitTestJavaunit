package com.example.model;

public class Product {

	private String id;
	private String name;
	private String type;
	private int qte;
	private Long price;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Product(String id, String name, String type, int qte, Long price) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.qte = qte;
		this.price = price;
	}
}
