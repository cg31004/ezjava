package com.hw.project1.entity;

import com.hw.project1.constants.DayOfWeekEnum;
import jakarta.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "class_schedules")
public class ClassSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String className;
    private LocalTime startTime;
    private LocalTime endTime;

    @Enumerated(EnumType.ORDINAL)
    private DayOfWeekEnum dayOfWeek;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}