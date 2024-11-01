package com.hw.project1.service;

import com.hw.project1.entity.ClassSchedule;
import com.hw.project1.repository.ClassScheduleRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClassScheduleService {

    private final ClassScheduleRepository classScheduleRepository;

    public ClassScheduleService(ClassScheduleRepository classScheduleRepository) {
        this.classScheduleRepository = classScheduleRepository;
    }

    public List<ClassSchedule> getClassScheduleByClassName(String className) {
        return classScheduleRepository.findByClassName(className);
    }
}
