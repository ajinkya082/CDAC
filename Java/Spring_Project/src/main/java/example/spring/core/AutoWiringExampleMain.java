package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoWiringExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appCtx=new AnnotationConfigApplicationContext(SpringConfig.class);
		Object obj=appCtx.getBean("myBorrower");
		System.out.println(obj);
	}

}
