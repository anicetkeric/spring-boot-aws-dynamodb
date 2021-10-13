package com.sample.microservice.awsdynamodb.service;




import com.sample.microservice.awsdynamodb.domain.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {


    /**
     * create new employee
     *
     * @param employee entity
     * @return entity that created
     */
    Employee create(Employee employee);

    /**
     * Update employee data
     *
     * @param employee entity
     * @return entity modified
     */
    Employee update(Employee employee, String id);


    /**
     * get Employee by id
     *
     * @param id entity id
     * @return Optional entity Employee
     */
    Optional<Employee> getById(String id);

    /**
     * Get all entities
     *
     * @return list of entity Employee
     */
    List<Employee> getAll();

    void delete(String id);

}