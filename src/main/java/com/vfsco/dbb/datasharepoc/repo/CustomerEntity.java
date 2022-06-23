package com.vfsco.dbb.datasharepoc.repo;

import java.util.Objects;

import com.vfsco.dbb.datasharepoc.service.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerEntity implements Comparable<CustomerEntity> {

    private final Long id;
    private final String name;

    @Override
    public int compareTo(CustomerEntity that) {
        return Long.compare(this.id, ((CustomerEntity) that).id);
    }

}
