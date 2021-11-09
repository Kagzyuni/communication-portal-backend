package com.communication.portal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "grade")
@Table(name = "grade")
public class ClassGrade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int gradeId;
    private String desc;
}
