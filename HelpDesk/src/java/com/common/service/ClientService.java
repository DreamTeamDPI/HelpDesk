/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.service;

import com.common.model.Client;
import java.util.List;

/**
 *
 * @author SEMEN
 */
public interface ClientService {
    Client addClient(Client cl);
    void delete(long id);
    Client editClient(Client cl);
    List<Client> getAll();
}
