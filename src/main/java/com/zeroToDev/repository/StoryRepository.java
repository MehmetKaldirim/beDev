package com.zeroToDev.repository;

import com.zeroToDev.entity.Story;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoryRepository extends JpaRepository<Story,Long> {

}
