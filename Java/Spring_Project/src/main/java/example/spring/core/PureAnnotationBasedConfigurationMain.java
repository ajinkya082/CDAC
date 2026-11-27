package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import second.SecondManagedComponent;
import third.ThirdManagedComponent;
import third.child.ThirdChildManagedComponent;

public class PureAnnotationBasedConfigurationMain {

	public static void main(String[] args) {
		ApplicationContext appCtx=
				new AnnotationConfigApplicationContext(SpringConfig.class);
		FirstManagedComponent fmc=
				appCtx.getBean(FirstManagedComponent.class);
		
		fmc.doWork();
		
		SecondManagedComponent smc=appCtx.getBean(SecondManagedComponent.class);
		smc.doWork();
		
		ThirdManagedComponent tmc=appCtx.getBean(ThirdManagedComponent.class);
		tmc.doWork();
		
		
		ThirdChildManagedComponent tcmc=appCtx.getBean(ThirdChildManagedComponent.class);
		tcmc.doWork();
	}

}
	