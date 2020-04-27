package com.Watheq.Watheq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Watheq.Watheq.dto.CourseDTO;
import com.Watheq.Watheq.mapperImp.CourseMapperImp;
import com.Watheq.Watheq.model.Course;
import com.Watheq.Watheq.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository;
	private static final CourseMapperImp courseMapper = new CourseMapperImp();
	
	public CourseDTO createCourseDTO(CourseDTO courseDTO) {
		Course course=Course.builder()
			    .courseId(courseDTO.getCourseId())
				.nationalId(courseDTO.getNationalId())
				.companyRefrence(courseDTO.getCompanyRefrence())
				.eduInstitutionId(courseDTO.getEducationInstitutionId())
				.addedBy(courseDTO.getAddedBy())
				.startDate(courseDTO.getStartDate())
				.endDate(courseDTO.getEndDate())
				.nameInstittion(courseDTO.getNameInstittion())
				.courseAttach(courseDTO.getCourseAttach())
	           .build();

		Course saveCourse = courseRepository.save(course);
        return courseMapper.domainToDto(saveCourse);
    }//end createCourseDTO()
}//end class
