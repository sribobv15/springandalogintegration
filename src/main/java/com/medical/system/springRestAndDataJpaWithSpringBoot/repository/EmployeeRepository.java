package com.medical.system.springRestAndDataJpaWithSpringBoot.repository;

import com.medical.system.springRestAndDataJpaWithSpringBoot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
