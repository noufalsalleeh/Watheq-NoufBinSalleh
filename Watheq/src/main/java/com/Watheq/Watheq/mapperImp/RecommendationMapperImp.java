package com.Watheq.Watheq.mapperImp;

import org.modelmapper.ModelMapper;

import com.Watheq.Watheq.dto.RecommendationDTO;
import com.Watheq.Watheq.mapper.RecommendationMapper;
import com.Watheq.Watheq.model.Recommendation;

public class RecommendationMapperImp implements RecommendationMapper{
	ModelMapper modelMapper;

	public RecommendationMapperImp() {
		modelMapper = new ModelMapper();
	}//RecommendationMapperImp()
	@Override
	public Recommendation dtoToDomain(RecommendationDTO recommendation) {
		return modelMapper.map(recommendation,Recommendation.class );

	}

	@Override
	public RecommendationDTO domainToDto(Recommendation recommendation) {
		return modelMapper.map(recommendation,RecommendationDTO.class );

	}

}//end class 
