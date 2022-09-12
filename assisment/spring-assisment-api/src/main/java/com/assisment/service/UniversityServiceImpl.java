package com.assisment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assisment.exception.UniversityNotFoundException;
import com.assisment.model.University;
import com.assisment.repository.IUniversityRepository;
@Service
public class UniversityServiceImpl implements IUniversityService {

	IUniversityRepository  universityRepository;
	
	@Autowired
	public void setUniversityRepository(IUniversityRepository universityRepository) {
		this.universityRepository = universityRepository;
	}

	@Override
	public University addUniversity(University university) throws UniversityNotFoundException {
		// TODO Auto-generated method stub
		return universityRepository.save(university);
	}

	@Override
	public void updateUniversity(University university) throws UniversityNotFoundException {
		// TODO Auto-generated method stub
		 universityRepository.save(university);
	}

	@Override
	public void deleteUniversity(int universityId) throws UniversityNotFoundException {
		// TODO Auto-generated method stub
		universityRepository.deleteById(universityId);
	}

	@Override
	public University getById(int universityId) throws UniversityNotFoundException {
		// TODO Auto-generated method stub
		return universityRepository.findById(universityId).get();
	}

	@Override
	public List<University> getByCity(String city) throws UniversityNotFoundException {
		// TODO Auto-generated method stub
		return universityRepository.findByCity(city);
	}

	@Override
	public University getByCollege(String collegeName) throws UniversityNotFoundException {
		// TODO Auto-generated method stub
		return universityRepository.findByCollege(collegeName);
	}

	
	
	
	
	

}
