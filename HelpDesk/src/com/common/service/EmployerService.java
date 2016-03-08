/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.service;


import com.common.entity.Employer;

import java.util.List;

/**
 *
 * @author SEMEN
 */
public interface EmployerService {
    Employer addEmployer(Employer empl);
    void delete(long id);
    Employer editEmployer(Employer empl);
    List<Employer> getAll();
}