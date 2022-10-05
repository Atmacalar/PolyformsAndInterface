package oopWithNLayeredAp;

import oopWithNLayeredAp.business.ProductManager;
import oopWithNLayeredAp.core.loging.DatabaseLogger;
import oopWithNLayeredAp.core.loging.FileLogger;
import oopWithNLayeredAp.core.loging.Logger;
import oopWithNLayeredAp.core.loging.MailLogger;
import oopWithNLayeredAp.entities.Product;
import oopWithNLayeredApd.dataAccess.jdbcProductDao;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1,"iphone14",10000);
		
		Logger[] loggers = {new DatabaseLogger(),new FileLogger(), new MailLogger()};
		
		ProductManager productManager = new ProductManager( new jdbcProductDao(),loggers );
		productManager.add(product1);
		

	}

}
