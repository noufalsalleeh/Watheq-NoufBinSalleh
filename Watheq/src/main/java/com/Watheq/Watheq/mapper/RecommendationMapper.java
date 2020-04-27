package com.Watheq.Watheq.mapper;

import com.Watheq.Watheq.dto.RecommendationDTO;
import com.Watheq.Watheq.model.Recommendation;

public interface RecommendationMapper {
	Recommendation dtoToDomain(final RecommendationDTO recommendation );

	RecommendationDTO domainToDto(final Recommendation recommendation );

}//end interface
