package onlyJavaWhatHasDoneInClass;

public class Student {
	String studentName;
	int studentRollNo;
	public Student(String studentName, int studentRollNo) {
		this.studentName=studentName;
		this.studentRollNo=studentRollNo;
		}
	public static void main(String[] args) {
		Student s1=new Student("Ambika",01);
		System.out.println(s1.studentName);
		System.out.println(s1.studentRollNo);
		Student s2=new Student("Menaka",02);
		System.out.println(s2.studentName);
		System.out.println(s2.studentRollNo);
	}

}
