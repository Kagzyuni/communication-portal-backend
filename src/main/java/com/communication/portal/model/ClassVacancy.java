package com.communication.portal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "classvacancy")
@Table(name = "classvacancy")
public class ClassVacancy {

    @Id
    private int classCode;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gradeId")
    private ClassGrade grade;
    private boolean vacancy;
    private String assignedTo;

}
