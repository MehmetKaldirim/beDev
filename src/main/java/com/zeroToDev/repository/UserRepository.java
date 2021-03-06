package com.zeroToDev.repository;

import com.zeroToDev.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserName(String username);

    @Transactional
    void deleteByUserName(String username);


}
