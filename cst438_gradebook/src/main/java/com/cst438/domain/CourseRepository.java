package com.cst438.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CourseRepository extends CrudRepository <Course, Integer> {
	@Query("select a from Assignment a where a.id= :assignmentID")
	Assignment findAssignmentByID(@Param("assignmentID") int assignmentID);
}
