package oopWithNLayeredAp.entities;

public class Product {
	
	private int id;
	private String name;
	private double unýtPrice;
	
	
	public Product() {
		
	}


	public Product(int id, String name, double unýtPrice) {
		
		this.id = id;
		this.name = name;
		this.unýtPrice = unýtPrice;
	}


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


	public double getUnýtPrice() {
		return unýtPrice;
	}


	public void setUnýtPrice(double unýtPrice) {
		this.unýtPrice = unýtPrice;
	}
	
	

}
