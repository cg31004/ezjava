package com.hw.project1.repository;

import com.hw.project1.entity.ClassSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ClassScheduleRepository extends JpaRepository<ClassSchedule, Long> {
    List<ClassSchedule> findByClassName(String className);
}