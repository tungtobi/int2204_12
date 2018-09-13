public class Student {
	private String name;
	private String id;
	private String group;
	private String email;
	
	public Student() {
		this.name = "Student";
		this.id = "000";
		this.group = "K59CB";
		this.email = "uet@vnu.edu.vn";
	}
	
	public Student(String n, String sid, String em) {
		this.name = String.copyValueOf(n);
		this.id = sid;
		this.group = "K59CB";
		this.email = em;
	}
	
	public Student(Student s) {
		this.name = s.getName;
		this.id = s.getId;
		this.group = s.getGroup;
		this.email = s.getEmail;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getGroup() {
		return group;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInfo() {
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
		System.out.println("Group: " + group);
		System.out.println("Email: " + email);
	}
}