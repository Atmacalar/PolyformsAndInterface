package oopWithNLayeredApd.dataAccess;

import oopWithNLayeredAp.entities.Product;

public class jdbcProductDao implements ProductDao {
	
	public void add(Product product) {
		
		//Buraya sadece sql kodlarý yazýlýr
	
		System.out.println("JDBC ile veritabanýna eklendi");	
		
	}
	



}
