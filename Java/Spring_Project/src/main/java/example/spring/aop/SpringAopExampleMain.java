package example.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAopExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appCtx=new AnnotationConfigApplicationContext(SpringAopConfig.class);
		
		Musician ms=appCtx.getBean(Musician.class);
		Singer sn=appCtx.getBean(Singer.class);
		ms.perform();
		System.out.println("+===========++===========+");
		sn.perform();
		System.out.println("+===========++===========+");
		System.out.println(ms.getClass().getName());
		System.out.println(sn.getClass().getName());
	}

}
