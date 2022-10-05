package oopWithNLayeredAp.business;

import java.util.Iterator;

import oopWithNLayeredAp.core.loging.Logger;
import oopWithNLayeredAp.entities.Product;
import oopWithNLayeredApd.dataAccess.HibernateProductDao;
import oopWithNLayeredApd.dataAccess.ProductDao;
import oopWithNLayeredApd.dataAccess.jdbcProductDao;

public class ProductManager {
	
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		
		this.productDao = productDao;
		this.loggers=loggers;
	}


	public void add(Product product) throws Exception {
		//i� kurallar� buraya yaz�l�r
		
		if(product.getUn�tPrice()<10)
		{
			throw new Exception("�r�n Fiyat� 10 dan K���k Olamaz");
		}
	
		//ProductDao productDao = new HibernateProductDao();
		
		
		
		productDao.add(product);
		
		for(Logger logger: loggers)
		{
			logger.log(product.getName());
		}
	}

}
