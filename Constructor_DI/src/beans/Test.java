package beans;

public class Test {

	private String name;
	private String email;
	private int age;

	
	public void print() {
		System.out.println("Hello " + name);
		System.out.println("Age " + age);
		System.out.println("Email " + email);
	}
	
	Test(String name, int age, String email) {
	
		this.age = age;
		this.email = email;
		this.name = name;
	}

}
