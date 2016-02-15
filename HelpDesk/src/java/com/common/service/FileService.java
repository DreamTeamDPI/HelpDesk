/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.service;

import com.common.model.File;
import java.util.List;

/**
 *
 * @author SEMEN
 */
public interface FileService {
    File addFile(File file);
    void delete(long id);
    File editFile(File file);
    List<File> getAll();
}
