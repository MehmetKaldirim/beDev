package com.zeroToDev.repository;

import com.zeroToDev.entity.Lecture;
import com.zeroToDev.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LectureRepository extends JpaRepository<Lecture,Long> {

}
