package com.assisment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.assisment.model.University;

public interface IUniversityRepository extends  JpaRepository<University, Integer>{
	
	@Query("from University where city=?1")
	public List<University> findByCity(String city) ;
	
	@Query("from University u inner join u.colleges c where c.collegeName=?1")
	public University findByCollege(String collegeName) ;
}
