package oopWithNLayeredApd.dataAccess;

import oopWithNLayeredAp.entities.Product;

public class HibernateProductDao implements ProductDao {

public void add(Product product) {
		
		//Buraya sadece sql kodlarý yazýlýr
	
		System.out.println("Hibernate ile veritabanýna eklendi");	
		
}
}
