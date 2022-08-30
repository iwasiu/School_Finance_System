package school;

import java.util.List;

import student.Student;
import workers.Staff;

/**
 * This class is responsible for keeping details of staff and students
 * as well as the totals of money received and spent by the school
 * @author femi
 *
 */
public class School {
	private List<Student> students;
	private List<Staff> staffs;
	
	private static double totalFeesRecieve;
	private static double totalMoneySpent;
	
	/**
	 * This creates an object of the school upon initialization
	 * 
	 * @param students the list of student
	 * @param staffs the list of staff
	 */
	public School(List<Student> students, List<Staff> staffs) {
		super();
		this.students = students;
		this.staffs = staffs;
	}

	/**
	 * 
	 * @return the list of student
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * 
	 * @param student to be added to the list of student
	 */
	public void addStudent(Student student) {
		students.add(student);
	}

	/**
	 * 
	 * @return the list of staff
	 */
	public List<Staff> getStaffs() {
		return staffs;
	}

	/**
	 * 
	 * @param staff to be added to the list of staff
	 */
	public void addStaff(Staff staff) {
		staffs.add(staff);
	}

	/**
	 * 
	 * @return the total fees receive from the student
	 */
	public double getTotalFeesRecieve() {
		return totalFeesRecieve;
	}

	/**
	 * Add money to the totalMoneyReceive field
	 * 
	 * @param fee to be added to totalMoneyReceive field
	 */
	public static void updateTotalFeesRecieve(double fee) {
		totalFeesRecieve += fee;
	}

	/**
	 * 
	 * @return the total spent by the school
	 */
	public double getTotalMoneySpent() {
		return totalMoneySpent;
	}

	/**
	 * 
	 * @param money to be added to totalMoneySpent field
	 */
	public static void updateTotalMoneySpent(double money) {
		totalMoneySpent += money;
	}
	
	/**
	 * 
	 * @return the amount balance after expenses are made 
	 */
	public double getBalance() {
		return totalFeesRecieve - totalMoneySpent;
	}

	// To get the school detail activities 
	@Override
	public String toString() {
		return "School [students=" + students + ", staffs=" + staffs + ", getStudents()=" + getStudents()
				+ ", getStaffs()=" + getStaffs() + ", TotalFeesRecieve()=" + getTotalFeesRecieve()
				+ ", TotalMoneySpent()=" + getTotalMoneySpent() + ", getBalance()=" + getBalance() + "]";
	}
	
}

