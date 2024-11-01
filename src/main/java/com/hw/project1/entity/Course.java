package com.hw.project1.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String information;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}