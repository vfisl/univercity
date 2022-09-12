package com.assisment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assisment.exception.CollegeNotFoundException;
import com.assisment.model.College;
import com.assisment.service.ICollegeService;
@RestController
@RequestMapping("college-api")
public class CollegeController {
	@Autowired
	ICollegeService collegeService;
	
@PostMapping("/colleges")
 public College addCollege(@RequestBody College college) throws CollegeNotFoundException {
	return collegeService.addCollege(college);
}
	@PutMapping("/colleges")
 public void updateCollege(@RequestBody College college) throws CollegeNotFoundException {
		collegeService.updateCollege(college);
	}
	@DeleteMapping("/colleges/collegeId/{collegeId}")
 public void deleteCollege(@PathVariable("collegeId") int collegeId) throws CollegeNotFoundException{
		collegeService.deleteCollege(collegeId);
	}
	
	@GetMapping("/colleges/city/{city}")
 public	void getByCity(@PathVariable("city") String city)throws CollegeNotFoundException {
		collegeService.getByCity(city);
	}
	@GetMapping("/colleges/universityName/{universityName}")
 public	void getByUniversity(@PathVariable("universityName") String universityName) throws CollegeNotFoundException{
		collegeService.getByUniversity(universityName);
	}
	@GetMapping("/colleges/departmentName/{departmentName}")
 public	void getByDepartmentName(@PathVariable("departmentName") String departmentName)throws CollegeNotFoundException {
		collegeService.getByDepartmentName(departmentName);
	}
	@GetMapping("/colleges/departmentHead/{departmentHead}/universityName/{universityName}")
 public	void getByDepartUniversity(@PathVariable("departmentHead") String departmentHead,@PathVariable("universityName") String universityName ) throws CollegeNotFoundException{ 
	  collegeService.getByDepartUniversity(departmentHead, universityName);
	}
}
