package com.vijeyyuvaraj.BootApplication.Controllers;

import com.vijeyyuvaraj.BootApplication.Entity.Department;
import com.vijeyyuvaraj.BootApplication.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    public Department saveDepartmentEntity(@RequestBody Department department){
        return departmentService.saveDepartmentEntity(department);
    }

    @GetMapping("/department")
    public List<Department> getDepartments(){
        return departmentService.fetchAllDepartments();
    }

    @GetMapping("/department/{id}")
    public Department findDepartment(@PathVariable("id") long departmentId){
        return departmentService.findDepartment(departmentId);
    }

    @DeleteMapping("/department/{id}")
    public String deleteDepartment(@PathVariable("id") long departmentId) {
        return departmentService.deleteDepartment(departmentId);
    }

    @PutMapping("/department/{id}")
    public Department updateDepartment(@PathVariable("id") long departmentId, @RequestBody Department department) {
        return  departmentService.updateDepartment(departmentId,department);
    }
}
