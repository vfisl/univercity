package com.assisment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.assisment.model.College;

public interface ICollegeRepository extends JpaRepository<College, Integer>{

	@Query("from College c inner join c.adress a where a.city=?1 ")
	public List<College> findByCity(String city);
	@Query("from College c inner join c.university u where u.universityName=?1 ")
	public List<College> findByUniversity(String universityName) ;
	@Query("from College c inner join c.departments d where d.departmentName=?1 ")
	public List<College> findByDepartmentName(String departmentName); 
	
	@Query("from College c inner join c.departments d inner join c.university u where d.departmentHead=?1 and u.universityName=?2")
	public List<College> findByDepartUniversity(String departmentHead, String universityName) ;
}
