package student;

import school.School;

/**
 * This class is responsible for keeping student's record
 * 
 * @author femi
 *
 */
public class Student {
	private int id;
	private String name;
	private String grade;
	private double fees;
	private double totalFeesPaid;
	
	/**
	 * This creates an object of a student
	 * 
	 * @param id the id of the student
	 * @param name the name of the student
	 * @param grade the grade of the student
	 */
	public Student(int id, String name, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.fees = 10000;
		this.totalFeesPaid = 0;
	}
	
	/**
	 * 
	 * @return the id of the student
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @return the name of the student
	 */
	public String getName() {
		return name;
	}
	
	/** 
	 * This is responsible for altering the name of the student
	 * @param name the name to be altered
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @return the grade of the student
	 */
	public String getGrade() {
		return grade;
	}
	
	/** 
	 * This is responsible for altering the grade of the student
	 * @param grade the grade to be altered
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	/**
	 * This is responsible for the fees payment by the student
	 * @param fees to be made or paid
	 */
	public void payFees(double fees) {
		// add to totalFeePaid
		totalFeesPaid += fees;
		// add to school's account
		School.updateTotalFeesRecieve(totalFeesPaid);
	}
	
	/**
	 * 
	 * @return the total fees paid by the student
	 */
	public double getTotalFeesPaid() {
		return totalFeesPaid;
	}
	
	/**
	 * 
	 * @return the total fees balance
	 */
	public double feeBalance() {
		return this.fees - totalFeesPaid;
	}

	// to get the student's details
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", fees=" + fees + ", totalFeesPaid="
				+ totalFeesPaid + ", balance=" + feeBalance() + "]";
	}
	
}
