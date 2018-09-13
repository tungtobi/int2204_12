public class StudentManagement {
	public static void main(String[] args) {
		Student student = new Student();
		
		student.setName("Nguyen Tung Lam");
		student.setId("17020845");
		student.setGroup("Int2204 12");
		student.setEmail("tungtobi@gmail.com);
		
		System.out.println(student.getName);
		
		student.getInfo();
		
		Student[] students;
		for (int i = 0; i < 3; i++) {
			students[i] = new Student();
		}
		students[0] = "K59CLC";
		
		System.out.println(sameGroup(students[0], students[1]);
		
	}
	
	public boolean sameGroup(Student s1, Student s2) {
		return s1.getGroup.equals(s2.getGroup);
	}
	
	public void sortByGroup(Student[] students) {
		for (int i = 0; i < students.size() - 1; i++) {
			for (int j = 0; j < students.size(); j++) {
				if (students[j].getGroup.compareTo(students[i]) > 0) {
					Student tmp = students[i];
					students[i] = students[j];
					students[j] = tmp;
				}
			}
		}
	}
	
	public void studentsByGroup(Student[] students) {
		sortByGroup(students);
		for (int i = 0; i < students.size(); i++) {
			if (i == 0 || !students[i].getGroup.equals(students[i - 1].getGroup)) {
				System.out.println(students[i].getGroup);
			}
			System.out.println(students[i].getName);
		}
	}
	
}