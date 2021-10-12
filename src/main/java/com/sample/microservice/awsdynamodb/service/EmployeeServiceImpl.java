package com.sample.microservice.awsdynamodb.service;

import com.sample.microservice.awsdynamodb.domain.Employee;
import com.sample.microservice.awsdynamodb.repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;

    // private final DynamoDBMapper mapper;

    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }


    @Override
    public Employee create(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public Optional<Employee> getById(String id) {
        return Optional.empty();
    }

    @Override
    public List<Employee> getAll() {
        return null;
    }

    @Override
    public Page<Employee> findAllPaginate(Pageable pageable) {
        return null;
    }
}