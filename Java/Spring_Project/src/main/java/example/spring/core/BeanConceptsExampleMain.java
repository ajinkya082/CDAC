package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanConceptsExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appCtx= new AnnotationConfigApplicationContext(SpringConfig.class);
		Object bean1=appCtx.getBean("bean1");
		Object anotherBean1=appCtx.getBean("bean1");
		System.out.println(bean1==anotherBean1);
	}

}
