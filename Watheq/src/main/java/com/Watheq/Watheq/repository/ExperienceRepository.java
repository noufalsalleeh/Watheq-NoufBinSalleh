package com.Watheq.Watheq.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Watheq.Watheq.model.Experience;
@Repository
@Transactional
public interface ExperienceRepository extends CrudRepository<Experience, Long>{
	@Modifying 
	@Query ("UPDATE Experience experience SET experience.experincePosition = :experincePosition WHERE experience.experienceId = :experienceId")
	void updateExperincePosition(@Param("experienceId") String experienceId, @Param("experincePosition") String experincePosition);
	
	
	@Modifying 
	@Query ("UPDATE Experience experience SET experience.startDate = :startDate WHERE experience.experienceId = :experienceId")
	void updateStartDate(@Param("experienceId") String experienceId, @Param("startDate") String startDate);
	
	@Modifying 
	@Query ("UPDATE Experience experience SET experience.endDate = :endDate WHERE experience.experienceId = :experienceId")
	void updateEndDate(@Param("experienceId") String experienceId, @Param("endDate") String endDate);
	
	@Modifying 
	@Query ("UPDATE Experience experience SET experience.refrenceName = :refrenceName WHERE experience.experienceId = :experienceId")
	void updateRefrenceName(@Param("experienceId") String experienceId, @Param("refrenceName") String refrenceName);
	
	
	
	@Modifying 
	@Query ("UPDATE Experience experience SET experience.refrenceEmail = :refrenceEmail WHERE experience.experienceId = :experienceId")
	void updateRefrenceEmail(@Param("experienceId") String experienceId, @Param("refrenceEmail") String refrenceEmail);
	
}
