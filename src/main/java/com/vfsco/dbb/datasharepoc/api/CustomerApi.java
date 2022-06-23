package com.vfsco.dbb.datasharepoc.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vfsco.dbb.datasharepoc.service.CustomerService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@AllArgsConstructor
@Slf4j
public class CustomerApi {
    
    private final CustomerService service;
    private final CustomerApiMapper mapper;

    @GET
    public List<CustomerSchema> findAll() {
        log.debug("Finding all customers");
        return mapper.mapToSchema(service.findAll());
    }
    
}
