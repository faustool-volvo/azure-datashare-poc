package com.vfsco.dbb.datasharepoc.repo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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

    private final Map<Long, CustomerEntity> customerMap = new HashMap<>();

    private Map<Long, CustomerEntity> getCustomerMap() {
        if (customerMap.isEmpty()) {
            var faker = new Faker();
            var count = faker.random().nextInt(1, 20);
            for (int i = 0; i < count; i++) {
                var customer = new CustomerEntity(Math.abs(faker.random().nextLong()), faker.name().fullName());
                customerMap.put(customer.getId(), customer);
            }
        }
        return customerMap;
    }

    public List<Customer> findAll() {
        List<CustomerEntity> customerList = new ArrayList<>(getCustomerMap().values());
        Collections.sort(customerList);
        return mapper.mapToDomain(customerList);
    }

    public Customer findById(Long id) {
        return mapper.mapToDomain(getCustomerMap().get(id));
    }

}
