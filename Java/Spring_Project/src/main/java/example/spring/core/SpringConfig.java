/*
 * this class is used for declaration of beans 
 * 
 * Beans are declared by defining a method which returns a an object og the class of which the bean is to be declared
 * 
 * In order to intimate Spring that the with @Bean annotation
 * 
 * by default the bean gets declared with an id i.e is the method name itself
 * Once the bean are declared in the configuration unit, anytime a client prog. can obtain them.Spring provide a class named as AnnotationConfigApplcationContext
 */ 
package example.spring.core;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration//Marks the class as a configuration specific class
public class SpringConfig {
	//Declare a bean of HelloService
	@Bean //Marks this method as a bean declaration method
	public HelloService getHelloService() {
		return new HelloService();
	}
	
	@Bean("movies") //customize the id
	public List<String> getMovies(){
		return Arrays.asList("Drishyam","Drishyam 2","Dial 100");
	}
	
	@Bean("emp")
	public Employee getEmployee() {
		Employee emp=new Employee();
		emp.setEmpNo(222);
		emp.setName("Mihika Dixit");
		emp.setSal(6558.56f);
		return emp;
	}
	
	@Bean("anotheremp")
	public Employee getAnotherEmployee() {
		Employee emp=new Employee(243,"Parag Joshi",66696.56f);
		
		return emp;
	}
	
	@Bean("bean1")
	@Lazy //Marks this bean as lazy
	@Scope("prototype") //changing the scope to prototype , default is singleton
	public BeanImpl getBeanImple() {
		return new BeanImpl();
	}
	
	@Bean("home")
	public Address getHomeAddress() {
		return new Address("Mumbai",400008);
	}
	
	@Bean("secondHome")
	public Address getSecondHomeAddress() {
		return new Address("Pune",411008);
	}
	
	@Bean("cust")
	public Customer getCustomer() {
		Customer cst= new Customer("Sushil Kumar","sushilkumar@gmail,com",getSecondHomeAddress());
		return cst;
	}
	
	@Bean("myBook")
	@Primary
	public Book getBook() {
		return new Book("Boardroom","Achyut Godbole");
	}
	@Bean("myAnotherBook")
	public Book getAnotherBook() {
		return new Book("Gemad","Yash Lonkar");
	}
	@Bean("myBorrower")
	public Borrower getBorrower() {
		Borrower br=new Borrower();
		br.setId(120);
		br.setName("Prajakta Deshmukh");
		return br;
		//not setting the book property because it is to be  auto-wired. 
	}
	
	
	
}
