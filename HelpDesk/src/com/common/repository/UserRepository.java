/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.repository;


import com.common.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 *
 * @author SEMEN
 */
public interface UserRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {

    User findUserByIdUser(Integer idUser);
    User findUserByLogin(String login);

    @Query(value = "select '*' from user LIMIT :offset , :count", nativeQuery = true)
    List<User> findNotAll(@Param("offset") int n, @Param("count") int count);


    List<User> findAll();

    @Override
    Page<User> findAll(Specification<User> specification, Pageable pageable);

    public List<User> findAll(Specification<User> s);
}