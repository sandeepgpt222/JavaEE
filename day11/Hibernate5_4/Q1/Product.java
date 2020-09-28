package mypack;

import javax.persistence.*;
@Entity

public class Product {
	private int id,qty,price;
	private String name;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public int getQty() {
		return qty;
	}
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	public void setId(int pid) {
		this.id = pid;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", qty=" + qty + ", price=" + price + ", name=" + name + "]";
	}
	
	
}
