package com.assisment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.assisment.model.Adress;
import com.assisment.model.College;
import com.assisment.model.Department;
import com.assisment.model.University;
import com.assisment.service.ICollegeService;
import com.assisment.service.IUniversityService;

@SpringBootApplication
public class SpringAssismentApiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringAssismentApiApplication.class, args);
	}

	@Autowired
	ICollegeService collegeService;
	@Autowired
	IUniversityService universityService;
	
	@Override
	public void run(String... args) throws Exception {
		
		University university=new University("VTU", "belgaum");
		
		Adress adress =new Adress("Bijapur", "Karnataka", "Ashram Road");
			
	    Department department1=new Department("Mech", "Pramod");
		Department department2=new Department("CS", "Root");
		Department department3=new Department("EC", "Joe");
		Set<Department> departments=new HashSet<>(Arrays.asList(department1,department2,department3));
		
		College college=new College("BLDEA",departments , adress, university);
		
		
		collegeService.addCollege(college);
	
//		
//		Adress nadress =new Adress("Bangalore", "Karnataka", "basavanagudi Road");
//		
//	    Department ndepartment1=new Department("Mech", "Pramod");
//		Department ndepartment2=new Department("CS", "Root");
//		Department ndepartment3=new Department("EC", "Joe");
//		Set<Department> ndepartments=new HashSet<>(Arrays.asList(ndepartment1,ndepartment2,ndepartment3));
//		
//		University nuniversity1=universityService.getById(1);
//		
//		College ncollege=new College("KLE",ndepartments , nadress, nuniversity1);
//		collegeService.addCollege(ncollege);
	}

}
