package oopWithNLayeredAp.core.loging;

public class MailLogger implements Logger {
	public void log(String data) {
		System.out.println("mail gönderildi: " +data);
		
	}

}
