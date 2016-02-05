package sample1;

import org.springframework.beans.factory.annotation.Autowired;

import services.MessageBean;

public class MessageBeanImpl implements MessageBean{
	private String name;
	private String greeting;
	private int num = 0;
	
	@Autowired
	private Outputer outputter;
	
	public MessageBeanImpl(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public void sayHello() {
		// TODO Auto-generated method stub
		
		String message = greeting + " " + name + " !! " + (++num);
		
		try {
			outputter.output(message);
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(message);
	}

	public void sayHello(String name) {
		// TODO Auto-generated method stub
		
	}

}
