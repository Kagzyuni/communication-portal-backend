package com.communication.portal.repository;

import com.communication.portal.model.ClassGrade;
import org.springframework.data.repository.CrudRepository;

public interface GradeRepository extends CrudRepository<ClassGrade, Integer> {
}
