/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.service;


import com.common.entity.Deprtment;

import java.util.List;

/**
 *
 * @author SEMEN
 */
public interface DepartService {
    Deprtment addDepart(Deprtment depart);
    void delete(long id);
    Deprtment editDepart(Deprtment depart);
    List<Deprtment> getAll();
}