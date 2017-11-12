package beans;

public class Student {

	private int rollNo;
	private String name;
	private String dept;
	
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void printData() {
		System.out.println("[ Roll no: "+rollNo+" Name: "+name+" Department: "+dept+" ]");
		
	}
	
	
}
