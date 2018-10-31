package hello;

import java.util.Date;

public class Greeting {
	
	long id;
	String content;
	Date date;
	public Greeting(long incrementAndGet, String format, Date date) {
		this.id = incrementAndGet;
		this.content = format;
		this.date = date;
	}

	public long getId() {
		return id;
	}
	
	public String getContent() {
		return content;
	}

	public Date getDate() {
		return date;
	}

	

}
