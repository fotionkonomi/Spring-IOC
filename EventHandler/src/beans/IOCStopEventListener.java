package beans;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class IOCStopEventListener implements ApplicationListener<ContextStoppedEvent>

{
	public void onApplicationEvent(ContextStoppedEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("On stop event Called Method...");
	}

}
