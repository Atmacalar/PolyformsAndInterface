package oopWithNLayeredAp.core.loging;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("veritaban�na logland�" + data);
		
	}
	

}
