package sample3;
import services.MessageBean;

public class MessageBeanKo implements MessageBean{
	int num = 0;
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("æ»≥Á«œººø‰ " + name + " !!!");
	}
	
	public int getNum() {
		return num;
	}
	public void setNum() {
		num++;
	}

	public void sayHello() {
		// TODO Auto-generated method stub
		
	}
	
	
}
