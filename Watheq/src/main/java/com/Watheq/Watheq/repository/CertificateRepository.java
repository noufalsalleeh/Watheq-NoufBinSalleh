package com.Watheq.Watheq.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Watheq.Watheq.model.Certificate;
@Repository
@Transactional
public interface CertificateRepository extends CrudRepository<Certificate, String>{
	@Modifying 
	@Query ("UPDATE Certificate certificate SET certificate.graduationDate = :graduationDate WHERE certificate.certificateId = :certificateId")
	void updateGraduationDate(@Param("certificateId") String certificateId, @Param("graduationDate") String graduationDate);
	
	@Modifying 
	@Query ("UPDATE Certificate certificate SET certificate.gpa = :gpa WHERE certificate.certificateId = :certificateId")
	void updateGpa(@Param("certificateId") String certificateId, @Param("gpa") String gpa);
	
	@Modifying 
	@Query ("UPDATE Certificate certificate SET certificate.degree = :degree WHERE certificate.certificateId = :certificateId")
	void updateDegree(@Param("certificateId") String certificateId, @Param("degree") String degree);
	
	@Modifying 
	@Query ("UPDATE Certificate certificate SET certificate.major = :major WHERE certificate.certificateId = :certificateId")
	void updateMajor(@Param("certificateId") String certificateId, @Param("major") String major);
	
}//end interface

