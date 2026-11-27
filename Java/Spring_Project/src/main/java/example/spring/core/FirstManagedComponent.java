package example.spring.core;

import org.springframework.stereotype.Component;

@Component //Marks this class as a spring Component so that Spring can manage it.
public class FirstManagedComponent {
	public void doWork() {
		System.out.println("First managed component works....");
	}
}
