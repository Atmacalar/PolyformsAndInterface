package oopWithNLayeredAp.entities;

public class Product {
	
	private int id;
	private String name;
	private double un�tPrice;
	
	
	public Product() {
		
	}


	public Product(int id, String name, double un�tPrice) {
		
		this.id = id;
		this.name = name;
		this.un�tPrice = un�tPrice;
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


	public double getUn�tPrice() {
		return un�tPrice;
	}


	public void setUn�tPrice(double un�tPrice) {
		this.un�tPrice = un�tPrice;
	}
	
	

}
