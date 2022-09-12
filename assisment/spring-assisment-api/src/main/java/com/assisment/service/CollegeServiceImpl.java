package com.assisment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assisment.exception.CollegeNotFoundException;
import com.assisment.model.College;
import com.assisment.repository.ICollegeRepository;
@Service
public class CollegeServiceImpl implements ICollegeService {

	ICollegeRepository collegeRepository;
	
	@Autowired
	public void setCollegeRepository(ICollegeRepository collegeRepository) {
		this.collegeRepository = collegeRepository;
	}

	@Override
	public College addCollege(College college) throws CollegeNotFoundException {
		// TODO Auto-generated method stub
		return collegeRepository.save(college);
	}

	@Override
	public void updateCollege(College college) throws CollegeNotFoundException {
		// TODO Auto-generated method stub
		collegeRepository.save(college);
	}

	@Override
	public void deleteCollege(int collegeId) throws CollegeNotFoundException {
		// TODO Auto-generated method stub
		collegeRepository.deleteById(collegeId);
	}

	@Override
	public College getById(int collegeId) throws CollegeNotFoundException {
		// TODO Auto-generated method stub
		return collegeRepository.findById(collegeId).get();
	}

	@Override
	public List<College> getByCity(String city) throws CollegeNotFoundException {
		// TODO Auto-generated method stub
		return collegeRepository.findByCity(city);
	}

	@Override
	public List<College> getByUniversity(String universityName) throws CollegeNotFoundException {
		// TODO Auto-generated method stub
		return collegeRepository.findByUniversity(universityName);
	}

	@Override
	public List<College> getByDepartmentName(String departmentName) throws CollegeNotFoundException {
		// TODO Auto-generated method stub
		return collegeRepository.findByDepartmentName(departmentName);
	}

	@Override
	public List<College> getByDepartUniversity(String departmentHead, String universityName) throws CollegeNotFoundException {
		// TODO Auto-generated method stub
		return collegeRepository.findByDepartUniversity(departmentHead, universityName);
	}

	
	

	
}
