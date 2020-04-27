package com.Watheq.Watheq.repository;




import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Watheq.Watheq.model.EducationInstitution;
@Repository
@Transactional
public interface EducationInstitutionRepository extends CrudRepository<EducationInstitution, String>{
	@Modifying 
	@Query ("UPDATE EducationInstitution educationInstitution SET educationInstitution.universityName = :universityName WHERE educationInstitution.eduInstitutionId = :eduInstitutionId")
	void updateUniversityName(@Param("eduInstitutionId") String educationInstitutionId, @Param("universityName") String universityName);
	
	@Modifying 
	@Query ("UPDATE EducationInstitution educationInstitution SET educationInstitution.universityType = :universityType WHERE educationInstitution.eduInstitutionId = :eduInstitutionId")
	void updateUniversityType(@Param("eduInstitutionId") String educationInstitutionId, @Param("universityType") String universityType);
	
	@Modifying 
	@Query ("UPDATE EducationInstitution educationInstitution SET educationInstitution.email = :email WHERE educationInstitution.eduInstitutionId = :eduInstitutionId")
	void updateEmail(@Param("eduInstitutionId") String educationInstitutionId, @Param("email") String email);
	
	@Modifying 
	@Query ("UPDATE EducationInstitution educationInstitution SET educationInstitution.phoneNumber = :phoneNumber WHERE educationInstitution.eduInstitutionId = :eduInstitutionId")
	void updatePhoneNumber(@Param("eduInstitutionId") String educationInstitutionId, @Param("phoneNumber") String phoneNumber);
	
	@Modifying 
	@Query ("UPDATE EducationInstitution educationInstitution SET educationInstitution.address = :address WHERE educationInstitution.eduInstitutionId = :eduInstitutionId")
	void updateAddress(@Param("eduInstitutionId") String educationInstitutionId, @Param("address") String address);
	
	@Modifying 
	@Query ("UPDATE EducationInstitution educationInstitution SET educationInstitution.password = :password WHERE educationInstitution.eduInstitutionId = :eduInstitutionId")
	void updatePassword(@Param("eduInstitutionId") String educationInstitutionId, @Param("password") String password);
	
}//end interface 
