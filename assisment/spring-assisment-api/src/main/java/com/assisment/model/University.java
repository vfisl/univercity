package com.assisment.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class University {

	private String universityName;
	@Id
	@GeneratedValue(generator = "uni_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "uni_gen",sequenceName = "uni_sequence",initialValue = 1, allocationSize = 1)
	private Integer universityId;
	private String city;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER, mappedBy = "university")
//	@JoinColumn(name = "university_id")
	Set<College> colleges;

	public University() {
		super();
	}

	
	public University(String universityName, String city) {
		super();
		this.universityName = universityName;
		this.city = city;
	}


	public String getUniversityName() {
		return universityName;
	}



	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}



	public Integer getUniversityId() {
		return universityId;
	}

	public void setUniversityId(Integer universityId) {
		this.universityId = universityId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Set<College> getColleges() {
		return colleges;
	}

	public void setColleges(Set<College> colleges) {
		this.colleges = colleges;
	}



	@Override
	public String toString() {
		return "University [universityName=" + universityName + ", city=" + city + "]";
	}

	
	
	
	
}
