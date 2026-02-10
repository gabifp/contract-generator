package com.gabriela.contracts.contractgenerator.controller;

import com.gabriela.contracts.contractgenerator.DTO.ContractGenerateRequest;
import com.gabriela.contracts.contractgenerator.DTO.ContractResponse;
import com.gabriela.contracts.contractgenerator.service.ContractTemplateService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contracts")
@CrossOrigin(origins = "http://localhost:4200")
public class ContractGenerateController {
    private final ContractTemplateService service;

    public ContractGenerateController(ContractTemplateService service) {
        this.service = service;
    }

    @PostMapping("/generate")
    public ContractResponse generate(@RequestBody ContractGenerateRequest request) {
        return service.generateContract(
                request.getTemplateId(),
                request.getFields()
        );
    }
}

