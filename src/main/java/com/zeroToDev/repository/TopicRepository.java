package com.zeroToDev.repository;

import com.zeroToDev.entity.Lecture;
import com.zeroToDev.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicRepository extends JpaRepository<Topic,Long> {
    List<Topic> readAllByLectureLectureName(String lecture);
}
