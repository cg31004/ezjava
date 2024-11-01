package com.hw.project1.controller;

import com.hw.project1.entity.ClassSchedule;
import com.hw.project1.service.ClassScheduleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/class-schedules")
public class ClassScheduleController {

    private final ClassScheduleService classScheduleService;

    public ClassScheduleController(ClassScheduleService classScheduleService) {
        this.classScheduleService = classScheduleService;
    }

    @GetMapping("/{className}")
    public List<ClassSchedule> getClassSchedule(@PathVariable String className) {
        return classScheduleService.getClassScheduleByClassName(className);
    }
}
