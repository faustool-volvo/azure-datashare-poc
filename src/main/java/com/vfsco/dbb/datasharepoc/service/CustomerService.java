package com.vfsco.dbb.datasharepoc.service;

import java.util.LinkedList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.vfsco.dbb.datasharepoc.repo.CustomerRepository;

import lombok.AllArgsConstructor;

@ApplicationScoped
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository repository;

    public List<Customer> findAll() {
        return repository.findAll();
    }

    public Customer findById(Long id) {
        return repository.findById(id);
    }

}
