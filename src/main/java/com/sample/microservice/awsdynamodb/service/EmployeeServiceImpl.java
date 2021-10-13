package com.sample.microservice.awsdynamodb.service;

import com.sample.microservice.awsdynamodb.domain.Employee;
import com.sample.microservice.awsdynamodb.exception.DataNotFoundException;
import com.sample.microservice.awsdynamodb.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Employee create(Employee employee) {
        return repository.save(employee);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Employee update(Employee employee, String id) {

        Optional<Employee> employeeOptional = repository.findById(id);
        if (employeeOptional.isPresent()) {
            employeeOptional.get().setFirstName(employee.getFirstName());
            employeeOptional.get().setLastName(employee.getLastName());
            employeeOptional.get().setEmail(employee.getEmail());
            employeeOptional.get().setNumber(employee.getNumber());
            employeeOptional.get().setDepartment(employee.getDepartment());

            return repository.save(employeeOptional.get());
        }
        throw new DataNotFoundException("Employee Id not found");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<Employee> getById(String id) {
        return repository.findById(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Employee> getAll() {
        return (List<Employee>) repository.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}