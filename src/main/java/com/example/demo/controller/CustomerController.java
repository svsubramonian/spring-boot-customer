package com.example.demo.controller;


import java.util.List;

import com.example.demo.message.Response;
import com.example.demo.model.Customer;
import com.example.demo.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository repository;

    @RequestMapping(value = "/customer/postcustomer", method = RequestMethod.POST)
    public void postCustomer(@RequestBody Customer customer) {

        repository.save(new Customer(customer.getFirstName(), customer.getLastName()));
    }

    @GetMapping("/customer/findall")
    public Response findAll() {

        Iterable<Customer> customers = repository.findAll();

        return new Response("Done", customers);
    }

    @RequestMapping("/customer/{id}")
    public Response findCustomerById(@PathVariable("id") Long id) {

        Customer customer = repository.findOne(id);

        return new Response("Done", customer);
    }

    @RequestMapping("/customer/findbylastname")
    public Response findByLastName(@RequestParam("lastName") String lastName) {

        List<Customer> customers = repository.findByLastName(lastName);

        return new Response("Done", customers);
    }
}