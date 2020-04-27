package com.Watheq.Watheq.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Watheq.Watheq.model.Course;
@Repository
@Transactional
public interface CourseRepository extends CrudRepository<Course, String>{
	@Modifying 
	@Query ("UPDATE Course course SET course.nameCourse = :nameCourse WHERE course.courseId = :courseId")
	void updateNameCourse(@Param("courseId") String courseID, @Param("nameCourse") String nameCourse);
	
	@Modifying 
	@Query ("UPDATE Course course SET course.startDate = :startDate WHERE course.courseId = :courseId")
	void updateStartDate(@Param("courseId") String courseID, @Param("startDate") String startDate);
	
	@Modifying 
	@Query ("UPDATE Course course SET course.endDate = :endDate WHERE course.courseId = :courseId")
	void updateEndDate(@Param("courseId") String courseID, @Param("endDate") String endDate);
	
	@Modifying 
	@Query ("UPDATE Course course SET course.nameInstittion = :nameInstittion WHERE course.courseId = :courseId")
	void updateNameInstittion(@Param("courseId") String courseID, @Param("nameInstittion") String nameInstittion);
	
	@Modifying 
	@Query ("UPDATE Course course SET course.courseAttach = :courseAttach WHERE course.courseId = :courseId")
	void updateCourseAttach(@Param("courseId") String courseID, @Param("courseAttach") String courseAttach);
}//end
