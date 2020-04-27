package com.Watheq.Watheq.mapper;

import com.Watheq.Watheq.dto.CourseDTO;
import com.Watheq.Watheq.model.Course;

public interface CourseMapper {

	
	Course dtoToDomain(final CourseDTO course );

	CourseDTO domainToDto(final Course course );

}
