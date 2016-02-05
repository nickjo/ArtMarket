package sample3;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.MessageSourceResourceBundle;
import org.springframework.core.io.FileSystemResource;

import services.MessageBean;

public class HelloApp {
	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		ApplicationContext factory = new FileSystemXmlApplicationContext("beans.xml");
		
		// 스프링이 제공하는 aop
		//MessageBean bean = (MessageBean)factory.getBean("proxy");
		
		// aspectJ 를 활용한 aop
		MessageBean bean = (MessageBean)factory.getBean("targetBean");
		bean.sayHello();
	}
}
