package com.vijeyyuvaraj.BootApplication.Dao;

import com.vijeyyuvaraj.BootApplication.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentDao extends JpaRepository<Department, Long> {
}
