package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSimpleExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configFile="./src/main/resources/spring-config.xml";
		ApplicationContext appCtx=new FileSystemXmlApplicationContext(configFile);
		Object obj=appCtx.getBean("myBean");
		GreetingService gs=(GreetingService) obj;
		System.out.println(" "+gs.sayGreeting());
		
		System.out.println("====================");
		GreetingService gs2=new HelloService();
		System.out.println(" "+gs2.sayGreeting());
	}

}
