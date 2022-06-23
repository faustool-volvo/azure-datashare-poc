package com.vfsco.dbb.datasharepoc.repo;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;

import com.github.javafaker.Faker;
import com.vfsco.dbb.datasharepoc.service.Customer;
import com.vfsco.dbb.datasharepoc.service.CustomerEntityMapper;

import lombok.AllArgsConstructor;

@ApplicationScoped
@AllArgsConstructor
public class CustomerRepository {

    private final CustomerEntityMapper mapper;

    private final List<CustomerEntity> customerList = new LinkedList<>();

    private List<CustomerEntity> getCustomerList() {
        if (customerList.isEmpty()) {
            var faker = new Faker();
            var count = faker.random().nextInt(1, 20);
            for (int i = 0; i < count; i++) {
                var customer = new CustomerEntity(Math.abs(faker.random().nextLong()), faker.name().fullName());
                customerList.add(customer);
            }
        }
        return customerList;
    }

    public List<Customer> findAll() {
        return mapper.mapToDomain(getCustomerList());
    }

}
