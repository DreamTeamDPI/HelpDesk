/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.service.impl;

import com.common.model.File;
import com.common.repository.FileRepository;
import com.common.service.FileService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author SEMEN
 */
@Service
public class FileServiceImpl implements FileService {

    @Autowired
    FileRepository fileRepsitory;
    
    @Override
    public File addFile(File file) {
        return fileRepsitory.saveAndFlush(file);
    }

    @Override
    public void delete(long id) {
        fileRepsitory.delete(id);
    }

    @Override
    public File editFile(File file) {
        return fileRepsitory.saveAndFlush(file);
    }

    @Override
    public List<File> getAll() {
        return fileRepsitory.findAll();
    }
    
}
