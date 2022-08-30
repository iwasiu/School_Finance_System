package school;

import java.util.List;

import student.Student;
import workers.Staff;

public class School {
	private List<Student> students;
	private List<Staff> staffs;
	
	private static double totalFeesRecieve;
	private static double totalMoneySpent;
	
	public School(List<Student> students, List<Staff> staffs) {
		super();
		this.students = students;
		this.staffs = staffs;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public List<Staff> getStaffs() {
		return staffs;
	}

	public void addStaff(Staff staff) {
		staffs.add(staff);
	}

	public double getTotalFeesRecieve() {
		return totalFeesRecieve;
	}

	public static void updateTotalFeesRecieve(double fee) {
		totalFeesRecieve += fee;
	}

	public double getTotalMoneySpent() {
		return totalMoneySpent;
	}

	public static void updateTotalMoneySpent(double money) {
		totalMoneySpent += money;
	}
	public double getBalance() {
		return totalFeesRecieve - totalMoneySpent;
	}

	@Override
	public String toString() {
		return "School [students=" + students + ", staffs=" + staffs + ", getStudents()=" + getStudents()
				+ ", getStaffs()=" + getStaffs() + ", TotalFeesRecieve()=" + getTotalFeesRecieve()
				+ ", TotalMoneySpent()=" + getTotalMoneySpent() + ", getBalance()=" + getBalance() + "]";
	}
	
	

	

}

