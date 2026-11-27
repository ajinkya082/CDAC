package third;

import org.springframework.stereotype.Component;

@Component
public class ThirdManagedComponent {
	public void doWork() {
		System.out.println("Third managed component works...");
	}
}
