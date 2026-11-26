package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appCtx=new AnnotationConfigApplicationContext(SpringConfig.class);
		Object emp1=appCtx.getBean("emp");
		Object emp2=appCtx.getBean("anotheremp");
		System.out.println(emp1);
		System.out.println(emp2);
	}

}
