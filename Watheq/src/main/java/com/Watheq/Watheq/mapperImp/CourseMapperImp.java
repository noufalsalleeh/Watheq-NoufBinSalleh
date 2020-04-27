package com.Watheq.Watheq.mapperImp;

import org.modelmapper.ModelMapper;

import com.Watheq.Watheq.dto.CourseDTO;
import com.Watheq.Watheq.mapper.CourseMapper;
import com.Watheq.Watheq.model.Course;

public class CourseMapperImp implements CourseMapper{
	ModelMapper modelMapper;

	public CourseMapperImp() {
		modelMapper = new ModelMapper();
	}//CourseMapperImp()
	@Override
	public Course dtoToDomain(CourseDTO course) {
		return modelMapper.map(course,Course.class );

	}

	@Override
	public CourseDTO domainToDto(Course course) {
		return modelMapper.map(course,CourseDTO.class );

	}

}
