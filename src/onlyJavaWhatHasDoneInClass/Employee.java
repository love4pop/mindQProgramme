package onlyJavaWhatHasDoneInClass;

public class Employee {
	String empName;
	String empDesignation;
	String empSalary;
	String empID;
	public Employee(String a,String b,String c,String d) {
		empName=a;
	    empDesignation=b;
		empSalary=c;
		empID=d;	
	}
	public static void main(String[] args) {
	    Employee e1=new Employee("Ambika","software engineer","4 lakhs","E01");
		System.out.println(e1.empName);
		System.out.println(e1.empDesignation);
		System.out.println(e1.empSalary);
	    System.out.println(e1.empID);	
	    Employee e2=new Employee("Menaka","software engineer","4 lakhs","E02");
	    System.out.println(e2.empName);
		System.out.println(e2.empDesignation);
		System.out.println(e2.empSalary);
	    System.out.println(e2.empID);	
	
	}

}
