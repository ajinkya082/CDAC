package example.hibernate.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_Master")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="emp_no")
	private Integer employeeNo;
	@Column(name="emp_name")
	private String name;
	@Column(name="emp_sal")
	private float sal;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="passport_no")//Foreign key column referred from employee_master referring to primary key of passport_master
	private Passport passport;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer employeeNo, String name, float sal, Passport passport) {
		super();
		this.employeeNo = employeeNo;
		this.name = name;
		this.sal = sal;
		this.passport = passport;
	}
	public Integer getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(Integer employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	@Override
	public String toString() {
		return "Employee [employeeNo=" + employeeNo + ", name=" + name + ", sal=" + sal + ", passport=" + passport
				+ "]";
	}

}
