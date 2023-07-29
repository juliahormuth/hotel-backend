package com.github.juliahormuth.hotelbackend.features.customer.presentation;

import com.github.juliahormuth.hotelbackend.features.customer.domain.CustomerService;
import com.github.juliahormuth.hotelbackend.features.customer.infra.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.UUID;


@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @PostMapping
    public CustomerModel createCustomer(@RequestBody CustomerModel customer) {
        return this.customerService.createCustomer(customer);
    }

    @GetMapping()
    public List<CustomerModel> findAll() {
        return this.customerService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<CustomerModel> findById(@PathVariable UUID id) {
        return this.customerService.findById(id);
    }

    @GetMapping("/name")
    public CustomerModel findByName(@RequestBody String name) {
        return this.customerService.findByName(name);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id) throws Exception {
        this.customerService.deleteById(id);
    }

    @PatchMapping("/{id}")
    public CustomerModel updateById(@RequestBody CustomerModel customer) throws Exception {
        return this.customerService.updateById(customer);
    }
}
