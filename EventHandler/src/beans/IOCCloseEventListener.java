package beans;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class IOCCloseEventListener implements  ApplicationListener<ContextClosedEvent>{

	public void onApplicationEvent(ContextClosedEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("On close Event Method....");
	}
	

}
