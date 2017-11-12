package beans;

public class Test {

	private static Test test;
	
	private Test() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor....");
		
	}
	
	public static Test getInstance() {
		
		if(test==null) {
			return new Test();
		} else {
			return test;
		}
		
	}
	
}
