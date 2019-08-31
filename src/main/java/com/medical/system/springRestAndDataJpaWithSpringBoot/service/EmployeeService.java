package com.medical.system.springRestAndDataJpaWithSpringBoot.service;

import com.medical.system.springRestAndDataJpaWithSpringBoot.entity.Employee;

import java.util.List;

/**
 * @author JavaSolutionsGuide
 *
 */
public interface EmployeeService {
    public List<Employee> retrieveEmployees();

    public Employee getEmployee(Long employeeId);

    public void saveEmployee(Employee employee);

    public void deleteEmployee(Long employeeId);

    public void updateEmployee(Employee employee);
}