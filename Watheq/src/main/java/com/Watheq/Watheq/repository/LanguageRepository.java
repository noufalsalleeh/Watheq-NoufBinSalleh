package com.Watheq.Watheq.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Watheq.Watheq.model.Language;


@Repository
@Transactional
public interface LanguageRepository extends CrudRepository<Language, Long>{

	
	@Modifying 
	@Query ("UPDATE Language language SET language.langugeName = :langugeName WHERE language.langugeId = :langugeId")
	void updateLangugeName(@Param("langugeId") String langugeId, @Param("langugeName") String langugeName);
	
	@Modifying 
	@Query ("UPDATE Language language SET language.langugeDate = :langugeDate WHERE language.langugeId = :langugeId")
	void updateLangugeDate(@Param("langugeId") String langugeId, @Param("langugeDate") String langugeDate);
	
	@Modifying 
	@Query ("UPDATE Language language SET language.langugeRefrenceNo = :langugeRefrenceNo WHERE language.langugeId = :langugeId")
	void updateLangugeRefrenceNo(@Param("langugeId") String langugeId, @Param("langugeRefrenceNo") String langugeRefrenceNo);
	
	@Modifying 
	@Query ("UPDATE Language language SET language.durationValid = :durationValid WHERE language.langugeId = :langugeId")
	void updateDurationValid(@Param("langugeId") String langugeId, @Param("durationValid") String durationValid);
	
	@Modifying 
	@Query ("UPDATE Language language SET language.langugeAttach = :langugeAttach WHERE language.langugeId = :langugeId")
	void updateLangugeAttach(@Param("langugeId") String langugeId, @Param("langugeAttach") String langugeAttach);
}//end interface
