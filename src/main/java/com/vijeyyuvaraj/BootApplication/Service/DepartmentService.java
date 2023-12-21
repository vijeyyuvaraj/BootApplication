package com.vijeyyuvaraj.BootApplication.Service;

import com.vijeyyuvaraj.BootApplication.Entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartmentEntity(Department department);

    List<Department> fetchAllDepartments();

    Department findDepartment(long departmentId);

    String deleteDepartment(long departmentId);

    Department updateDepartment(long departmentId, Department department);
}
