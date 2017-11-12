package beans;

public class Test {

	private String name;
	private String email;
	private int age;

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println("Hello " + name);
		System.out.println("Age " + age);
		System.out.println("Email " + email);
	}

}
