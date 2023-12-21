package com.vijeyyuvaraj.BootApplication.Service.impl;

import com.vijeyyuvaraj.BootApplication.Dao.DepartmentDao;
import com.vijeyyuvaraj.BootApplication.Entity.Department;
import com.vijeyyuvaraj.BootApplication.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public Department saveDepartmentEntity(Department department) {
        return departmentDao.save(department);
    }

    @Override
    public List<Department> fetchAllDepartments() {
        return departmentDao.findAll();
    }

    @Override
    public Department findDepartment(long departmentId) {
        return departmentDao.findById(departmentId).get();
    }

    @Override
    public String deleteDepartment(long departmentId) {
        departmentDao.deleteById(departmentId);
        return "Record deleted successfully!";
    }

    @Override
    public Department updateDepartment(long departmentId, Department department) {
        Department dataFromDB = departmentDao.findById(departmentId).get();
        if(Objects.nonNull(department.getName()) && !"".equalsIgnoreCase(department.getName())){
            dataFromDB.setName(department.getName());
        }
        if(Objects.nonNull(department.getAddress()) && !"".equalsIgnoreCase(department.getAddress())){
            dataFromDB.setAddress(department.getAddress());
        }
        if(department.getCode() != 0){
            dataFromDB.setCode(department.getCode());
        }
        return departmentDao.save(dataFromDB);
    }
}
