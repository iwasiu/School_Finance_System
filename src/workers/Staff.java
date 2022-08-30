package workers;

import school.School;

/**This class is responsible for keeping staff details
 * 
 * @author femi
 *
 */
public class Staff {
	private int id;
	private String name;
	private double salary;
	private double totalSalaryRecieve;
	
	/**
	 * This creates an object of a staff through initialization
	 * @param id the id of the staff
	 * @param name the name of the staff
	 * @param salary the salary of the staff
	 */
	public Staff(int id, String name,double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		totalSalaryRecieve = 0;
	}

	/**
	 * 
	 * @return the id of the staff
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @return the name of the staff
	 */
	public String getName() {
		return name;
	}

	/**
	 * This is responsible for changing the of the staff
	 * @param name to be changed
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return the salary of the staff
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * This is responsible for altering the staff salary
	 * @param salary to be altered
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * 
	 * @return the total salary that is received by the staff
	 */
	public double getTotalSalaryRecieve() {
		return totalSalaryRecieve;
	}

	/**
	 * 
	 * @param money to be added to the totalSalaryRecieve field
	 */
	public void recieveSalary(double money) {
		// add the money to totalSalaryRecieve field
		totalSalaryRecieve += money;
		// add to school expense field
		School.updateTotalMoneySpent(totalSalaryRecieve);
	}

	// TO get the staff details
	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", salary=" + salary + ", totalSalaryRecieve="
				+ totalSalaryRecieve + ", getSalary()=" + getSalary() + "]";
	}
	
}
