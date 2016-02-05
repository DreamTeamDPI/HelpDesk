package com.common.service;


import com.common.model.Department;
import java.util.List;

public interface DepartService {

    Department addDepart(Department depart);
    void delete(long id);
    Department editDepart(Department depart);
    List<Department> getAll();

}
