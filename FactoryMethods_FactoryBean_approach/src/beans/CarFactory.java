package beans;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory  implements FactoryBean{
	
	private  String carName;
	
	public  void setCarName(String carName) {
		this.carName = carName;
	}

	public Object getObject() throws Exception {
		// TODO Auto-generated method stubca
		Car c = (Car) Class.forName(carName).newInstance();
		return c;
	}

	public Class getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}
	
	

}
