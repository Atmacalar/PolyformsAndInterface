package oopWithNLayeredApd.dataAccess;

import oopWithNLayeredAp.entities.Product;

public class HibernateProductDao implements ProductDao {

public void add(Product product) {
		
		//Buraya sadece sql kodlar� yaz�l�r
	
		System.out.println("Hibernate ile veritaban�na eklendi");	
		
}
}
