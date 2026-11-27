package third.child;

import org.springframework.stereotype.Component;

@Component
public class ThirdChildManagedComponent {
	public void doWork() {
		System.out.println("Third Child Managed Component works...");
	}
}
