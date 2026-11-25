package example.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Passport_Master")
public class Passport {
	@Id
	@Column(name="passport_no" ,length = 8)
	private String passportNo;
	@Column(name="passport_name" ,length = 40)
	private String name;
	@Column(name="passport_issue_at" ,length = 30)
	private String isseudAt;
	public Passport() {
		// TODO Auto-generated constructor stub
	}
	public Passport(String passportNo, String name, String isseudAt) {
		super();
		this.passportNo = passportNo;
		this.name = name;
		this.isseudAt = isseudAt;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsseudAt() {
		return isseudAt;
	}
	public void setIsseudAt(String isseudAt) {
		this.isseudAt = isseudAt;
	}
	@Override
	public String toString() {
		return "Passport [passportNo=" + passportNo + ", name=" + name + ", isseudAt=" + isseudAt + "]";
	}
	
}
