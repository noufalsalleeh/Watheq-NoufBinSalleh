package com.Watheq.Watheq.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Watheq.Watheq.model.Individual;

@Repository
@Transactional
public interface IndividualRepository extends CrudRepository<Individual,String>{
	
	@Modifying 
	@Query ("UPDATE Individual individual SET individual.status = :status WHERE individual.nationalId = :nationalId")
	void updateStatus(@Param("nationalId") String nationalId, @Param("status") String status);
	
	@Modifying 
	@Query ("UPDATE Individual individual SET individual.skill = :skill WHERE individual.nationalId = :nationalId")
	void updateSkill(@Param("nationalId") String nationalId, @Param("skill") String skill);
	
	@Modifying 
	@Query ("UPDATE Individual individual SET individual.attachment = :attachment WHERE individual.nationalId = :nationalId")
	void updateAttachment(@Param("nationalId") String nationalId, @Param("attachment") String attachment);
	
	
	
	@Modifying 
	@Query ("UPDATE Individual individual SET individual.email = :email WHERE individual.nationalId = :nationalId")
	void updateEmail(@Param("nationalId") String nationalId, @Param("email") String email);
	
	@Modifying 
	@Query ("UPDATE Individual individual SET individual.phoneNumber = :phoneNumber WHERE individual.nationalId = :nationalId")
	void updatePhoneNumber(@Param("nationalId") String nationalId, @Param("phoneNumber") String phoneNumber);
	
	@Modifying 
	@Query ("UPDATE Individual individual SET individual.address = :address WHERE individual.nationalId = :nationalId")
	void updateAddress(@Param("nationalId") String nationalId, @Param("address") String address);
	
	@Modifying 
	@Query ("UPDATE Individual individual SET individual.password = :password WHERE individual.nationalId = :nationalId")
	void updatePassword(@Param("nationalId") String nationalId, @Param("password") String password);
}//end class 
