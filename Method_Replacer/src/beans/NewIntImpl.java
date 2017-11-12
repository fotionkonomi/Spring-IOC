package beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewIntImpl implements MethodReplacer {

	public Object reimplement(Object o, Method m, Object[] parameter)
			throws Throwable {
		
		System.out.println("Cal Interest Method REplaced with new Implementation..");
		
		return o;
	}

}
