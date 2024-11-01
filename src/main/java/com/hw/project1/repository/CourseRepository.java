package com.hw.project1.repository;

import com.hw.project1.entity.Course;
import com.hw.project1.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {}
