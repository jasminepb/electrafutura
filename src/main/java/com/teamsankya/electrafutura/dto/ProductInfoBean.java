package com.teamsankya.electrafutura.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="product_info")
public class ProductInfoBean implements Serializable{
	@Id
	@Column(name="product_id")
	private int productId;
	@Column(name="product_name")
	private String productName;
	@Column(name="price")
	private double price;
	@Column(name="category")
	private String category;
	@Column(name="image_location")
	private String imageLocation;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getImageLocation() {
		return imageLocation;
	}
	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}
	@Override
	public String toString() {
		return "ProductInfoBean [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", category=" + category + ", imageLocation=" + imageLocation + "]";
	}
	
	
	

}
