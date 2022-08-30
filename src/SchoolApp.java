import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import school.School;
import student.Student;
import workers.Secretary;
import workers.Staff;
import workers.Teacher;

public class SchoolApp {

	public static void main(String[] args) {

		Student s1 = new Student(1, "A", "one");
		Student s2 = new Student(2, "B", "two");
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		
		Staff t1 = new Teacher(1, "teacher1",1000.0);
		Staff sec1 = new Secretary(1, "secretary1",900.0);
		
		List<Staff> staffList = new ArrayList<>();
		staffList.add(t1);
		staffList.add(sec1);
		
		
		School mySchool = new School(studentList, staffList);
		System.out.println("School has recieved fee total: # "
				+ mySchool.getTotalFeesRecieve());
	
		System.out.println("######## students make fee payment ############");
		s1.payFees(2000);
		s2.payFees(1000);
		System.out.println("School purse recieved: #"+ mySchool.getTotalFeesRecieve());
		System.out.println("School purse spent: #"+ mySchool.getTotalMoneySpent());
		System.out.println("School purse balance: #"+ mySchool.getBalance());
				
		System.out.println("######## school pays salaries ############");
		t1.recieveSalary(500);
		sec1.recieveSalary(200);
		System.out.println("School purse recieved: #"+ mySchool.getTotalFeesRecieve());
		System.out.println("School purse spent: #"+ mySchool.getTotalMoneySpent());
		System.out.println("School purse balance: #"+ mySchool.getBalance());
		
		System.out.println("######## school details ############");
		System.out.println("THe school has the following:\n "+mySchool.toString());
		
	

	}

}
