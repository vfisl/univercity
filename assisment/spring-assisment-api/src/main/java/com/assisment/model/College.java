package com.assisment.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
@Entity
public class College {

	private String collegeName;
	@Id
	@GeneratedValue(generator = "college_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "college_gen",sequenceName = "college_sequence",initialValue = 1, allocationSize = 1)
	private Integer collegeId;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "college_id")
	Set<Department> departments;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "college_id")
	Adress adress;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "university_id")
	University university;
	
	

	public College() {
		super();
	}

	
	public College(String collegename, Set<Department> departments, Adress adress, University university) {
		super();
		this.collegeName = collegename;
		this.departments = departments;
		this.adress = adress;
		this.university = university;
	}


	public String getCollegename() {
		return collegeName;
	}

	public void setCollegename(String collegename) {
		this.collegeName = collegename;
	}

	public Integer getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}

	public Set<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(Set<Department> departments) {
		this.departments = departments;
	}

	
	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	
	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "College [collegename=" + collegeName + "]";
	}
	
	
	
}
