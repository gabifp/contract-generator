package com.gabriela.contracts.contractgenerator.controller;

import com.gabriela.contracts.contractgenerator.DTO.AddressResponse;
import com.gabriela.contracts.contractgenerator.service.AddressService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
public class AddressController {
    private final AddressService addressService;

    public AddressController(AddressService addressService) {

        this.addressService = addressService;
    }

    @GetMapping("/{cep}")
    public AddressResponse getAddressByCEP(@PathVariable String cep) {

        return addressService.getAddressByCep(cep);
    }


}
