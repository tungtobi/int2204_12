public class StudentManagement {
	public static void main(String[] args) {
		Student[] students;
		for (int i = 0; i < 3; i++) {
			students[i] = new Student();
		}
		
		student.setName("Nguyen Tung Lam");
		student.setId("17020845");
		student.setGroup("Int2204 12");
		student.setEmail("tungtobi@gmail.com);
		
		System.out.println(student.getName);
		
		student.getInfo();
	}
	
	public boolean sameGroup(Student s1, Student s2) {
		return s1.getGroup.equals(s2.getGroup);
	}
}