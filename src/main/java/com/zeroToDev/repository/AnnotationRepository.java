package com.zeroToDev.repository;

import com.zeroToDev.entity.Annotation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnotationRepository extends JpaRepository<Annotation,Long> {
}
