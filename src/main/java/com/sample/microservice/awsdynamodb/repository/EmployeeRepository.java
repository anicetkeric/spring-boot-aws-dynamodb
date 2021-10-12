package com.sample.microservice.awsdynamodb.repository;

import com.sample.microservice.awsdynamodb.domain.Employee;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@EnableScan
@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, String> {
}
