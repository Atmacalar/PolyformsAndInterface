package oopWithNLayeredApd.dataAccess;

import oopWithNLayeredAp.entities.Product;

public class jdbcProductDao implements ProductDao {
	
	public void add(Product product) {
		
		//Buraya sadece sql kodlar� yaz�l�r
	
		System.out.println("JDBC ile veritaban�na eklendi");	
		
	}
	



}
