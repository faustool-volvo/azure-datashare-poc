package com.vfsco.dbb.datasharepoc.service;

import java.util.List;

import org.mapstruct.Mapper;

import com.vfsco.dbb.datasharepoc.repo.CustomerEntity;

@Mapper(componentModel = "cdi")
public interface CustomerEntityMapper {
    
    public List<Customer> mapToDomain(List<CustomerEntity> entityList);

}
