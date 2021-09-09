package week1.day2;

public class StudentClass {
	int stud_num = 20;
	char stud_initials = 'J';
	String subject$ = "Computer Science";
	float stud_percentage = 75.5f;
	long reg_num = 20210909L;

	public void OutStud() {
		System.out.println("Outstanding Students are 5");
	}

	public void AvgStud() {
		System.out.println("Average Students are 10");
	}

	public void FailedStud() {
		System.out.println("Failed Students are 5");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClass student = new StudentClass();

		int studentNumber = student.stud_num;
		char studentInitials = student.stud_initials;
		String subjectName = student.subject$;
		float studentPercentage = student.stud_percentage;
		long registerNumber = student.reg_num;

		System.out.println("Total Number of students are " + studentNumber);
		System.out.println("Student Initial is " + studentInitials);
		System.out.println("Subject Name is " + subjectName);
		System.out.println("Students Percentage is " + studentPercentage);
		System.out.println("Student Register Number is " + registerNumber);

		student.OutStud();
		student.AvgStud();
		student.FailedStud();
	}
}
