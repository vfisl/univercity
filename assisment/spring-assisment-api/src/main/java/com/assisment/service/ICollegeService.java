package com.assisment.service;

import java.util.List;

import com.assisment.exception.CollegeNotFoundException;
import com.assisment.model.College;

public interface ICollegeService {

	
	
	
 College addCollege(College college) throws CollegeNotFoundException;
	
	void updateCollege(College college) throws CollegeNotFoundException;
	
	void deleteCollege(int collegeId) throws CollegeNotFoundException;
	
	College getById(int collegeId) throws CollegeNotFoundException;
	
	List<College> getByCity(String city) throws CollegeNotFoundException;
	
	List<College> getByUniversity(String universityName) throws CollegeNotFoundException;
	
	List<College> getByDepartmentName(String departmentName) throws CollegeNotFoundException;
	
	List<College> getByDepartUniversity(String departmentHead,String universityName ) throws CollegeNotFoundException;
	
}
