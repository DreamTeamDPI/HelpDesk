/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.repository;

import com.common.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author SEMEN
 */
public interface ClientRepository extends JpaRepository<Client,Long> {
    
}
