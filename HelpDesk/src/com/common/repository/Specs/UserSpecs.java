/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.repository.Specs;


import com.common.entity.User;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author SemmEs
 */
public class UserSpecs {

  public static Specification<User> nameLikeSem() {
    return new Specification<User>() {
      @Override
      public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder builder) {

        //root = query.from(User.class);
         return builder.like(root.get("firstName"), "Sem");
      }
    };
  }
  
  public static Specification<User> hasSecondName() {
    return new Specification<User>() {
      public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query,CriteriaBuilder builder) {

         //root = query.from(User.class);
         return builder.isNotNull(root.get("lastName"));
      }
    };
  }

  public static Specification<User> findAllByRole(Integer i) {
    return new Specification<User>() {
      @Override
      public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        return builder.equal(root.get("roleIdRole"), i);//lessThan(root.get("roleIdRole"),i);//like(root.get("roleIdRole"),String.valueOf(i));
      }
    };
  }

  public static Specification<User> findAllByName(String name) {
    return new Specification<User>() {
      @Override
      public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        return builder.equal(root.get("firstName"), name);//lessThan(root.get("roleIdRole"),i);//like(root.get("roleIdRole"),String.valueOf(i));
      }
    };
  }

}
