package com.assisment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Department {

	private String departmentName;
	@Id
	@GeneratedValue(generator = "depart_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "depart_gen",sequenceName = "depart_sequence",initialValue = 1, allocationSize = 1)
	private Integer departmentId;
	private String departmentHead;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String departmentName, String departmenthead) {
		super();
		this.departmentName = departmentName;
		this.departmentHead = departmenthead;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmenthead() {
		return departmentHead;
	}
	public void setDepartmenthead(String departmenthead) {
		this.departmentHead = departmenthead;
	}
	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", departmenthead=" + departmentHead + "]";
	}
	
	
	
}
