package day3.emp;
//Employee 테이블 구조

import java.util.Date;
//테이블 레코드 1건을 담기   emp = { id:1, fir:"aaaa", ... }
public class Employee {

	private int employeeId;
	private String firstName;
	private String email;
	private long salary;
	private Date hireDate;
	
	//id, firstName, salary 초기화
	
	public Employee(int employeeId, String firstName, long salary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", email=" + email + ", salary="
				+ salary + ", hireDate=" + hireDate + "]";
	}


	//setter /getter
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	
}
