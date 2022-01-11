package com.thbs.entity;

import javax.persistence.*;

@Entity
@Table(name="jewels")
public class Jewels {
	@Id
	private int jewel_id;
	private String jewel_metal;
	private String jewel_type;
	private int weight;
	private double price;
	public String getJewel_metal() {
		return jewel_metal;
	}
	public void setJewel_metal(String jewel_metal) {
		this.jewel_metal = jewel_metal;
	}
	public String getJewel_type() {
		return jewel_type;
	}
	public void setJewel_type(String jewel_type) {
		this.jewel_type = jewel_type;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

}
