package com.zeroToDev.repository;

import com.zeroToDev.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    //build all querries that will bring data from dp
    //ready repository
    //native jpql or derive querries
}