package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanWiringExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appCtx=new AnnotationConfigApplicationContext(SpringConfig.class);
		Object obj=appCtx.getBean("cust");
		System.out.println(obj);
	}

}
