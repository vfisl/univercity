package com.assisment.service;

import java.util.List;

import com.assisment.exception.UniversityNotFoundException;
import com.assisment.model.University;


public interface IUniversityService {

	University addUniversity(University university)  throws UniversityNotFoundException;
	
	void updateUniversity(University university)  throws UniversityNotFoundException;
	
	void deleteUniversity(int universityId)  throws UniversityNotFoundException;
	
	University getById(int universityId)  throws UniversityNotFoundException;
	
	List<University> getByCity(String city)  throws UniversityNotFoundException;
   University getByCollege(String collegeName)  throws UniversityNotFoundException;
	
}
