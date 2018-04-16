package org.beanfactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		System.out.println(triangle.getType() + " - " + triangle.getHeight());
	}

}
