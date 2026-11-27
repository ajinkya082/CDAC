package second;

import org.springframework.stereotype.Component;

@Component
public class SecondManagedComponent {
	public void doWork() {
		System.out.println("Second managed component works....");
	}
}
