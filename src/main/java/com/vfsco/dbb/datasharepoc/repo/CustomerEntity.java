package com.vfsco.dbb.datasharepoc.repo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerEntity {

    private final Long id;
    private final String name;
    
}
