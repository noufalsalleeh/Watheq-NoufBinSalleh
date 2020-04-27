package com.Watheq.Watheq.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Watheq.Watheq.model.Recommendation;
@Repository
@Transactional
public interface RecommendationRepository extends CrudRepository<Recommendation, String>{
	@Modifying 
	@Query ("UPDATE Recommendation recommendation SET recommendation.recommendationFrom = :recommendationFrom WHERE recommendation.recommendationId = :recommendationId")
	void updateRecommendationFrom(@Param("recommendationId") String recommendationId, @Param("recommendationFrom") String recommendationFrom);
	
	
	@Modifying 
	@Query ("UPDATE Recommendation recommendation SET recommendation.recommendationDate = :recommendationDate WHERE recommendation.recommendationId = :recommendationId")
	void updateRecommendationDate(@Param("recommendationId") String recommendationId, @Param("recommendationDate") String recommendationDate);
	
	@Modifying 
	@Query ("UPDATE Recommendation recommendation SET recommendation.recommendationAttach = :recommendationAttach WHERE recommendation.recommendationId = :recommendationId")
	void updateRecommendationAttach(@Param("recommendationId") String recommendationId, @Param("recommendationAttach") String recommendationAttach);
	
}//end interface 
