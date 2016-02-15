/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.service;

import com.common.model.Organization;
import java.util.List;

/**
 *
 * @author SEMEN
 */
public interface OrganizationService {
    Organization addOrganiz(Organization organization);
    void delete(long id);
    Organization editOrganiz(Organization organization);
    List<Organization> getAll();
}
