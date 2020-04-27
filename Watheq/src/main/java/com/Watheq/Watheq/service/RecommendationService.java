package com.Watheq.Watheq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Watheq.Watheq.dto.RecommendationDTO;
import com.Watheq.Watheq.mapperImp.RecommendationMapperImp;

import com.Watheq.Watheq.model.Recommendation;

import com.Watheq.Watheq.repository.RecommendationRepository;

@Service
public class RecommendationService {
	@Autowired
	RecommendationRepository recommendationRepository;
	private static final RecommendationMapperImp recommendationMapper = new RecommendationMapperImp();

	public RecommendationDTO createRecommendationDTO(RecommendationDTO recommendationDTO) {
		Recommendation recommendation = Recommendation.builder()
				.nationalId(recommendationDTO.getNationalId())
				.companyRefrence(recommendationDTO.getCompanyRefrence())
				.educationInstitutionId(recommendationDTO.getEducationInstitutionId())
				.recommendationFrom(recommendationDTO.getRecommendationFrom())
				.recommendationDate(recommendationDTO.getRecommendationDate())
				.recommendationAddBy(recommendationDTO.getRecommendationAddBy())
				.recommendationAttach(recommendationDTO.getRecommendationAttach())
				.build();


		Recommendation saveRecommendation = recommendationRepository.save(recommendation);
		return recommendationMapper.domainToDto(saveRecommendation);
	}//end createExperienceDTO()
}//end class
