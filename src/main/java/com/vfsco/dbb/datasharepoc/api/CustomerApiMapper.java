package com.vfsco.dbb.datasharepoc.api;

import java.util.List;

import org.mapstruct.Mapper;

import com.vfsco.dbb.datasharepoc.service.Customer;

@Mapper(componentModel = "cdi")
public interface CustomerApiMapper {

    public List<CustomerSchema> mapToSchema(List<Customer> serviceCustomerList);
    
}
