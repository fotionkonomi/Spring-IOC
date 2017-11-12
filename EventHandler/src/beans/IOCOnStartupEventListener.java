package beans;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class IOCOnStartupEventListener implements ApplicationListener<ContextStartedEvent>{

	
	public void onApplicationEvent(ContextStartedEvent arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("On start up Called Event...");
	}

	
}
