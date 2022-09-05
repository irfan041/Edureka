package business;

public class Student {
	private String name;
	private int age;
	private String email;
	
	Student(){
		System.out.println("Student Default Consructor");
	}
	
	
	public Student(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public String getEmail() {
		return email;
	}


	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
