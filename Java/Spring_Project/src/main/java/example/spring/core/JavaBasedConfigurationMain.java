package example.spring.core;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedConfigurationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext apptx=new AnnotationConfigApplicationContext(SpringConfig.class);
		Object obj=apptx.getBean("getHelloService");
		GreetingService gs=(GreetingService) obj;
		System.out.println(gs.sayGreeting());
		
		System.out.println("========================");
		List<String>allMovies=(List<String>) apptx.getBean("movies");
		allMovies.stream().forEach(movie->System.out.println(movie));
	}

}
