package com.gabriela.contracts.contractgenerator.controller;

import com.gabriela.contracts.contractgenerator.DTO.ContractGenerateRequest;
import com.gabriela.contracts.contractgenerator.entity.ContractTemplate;
import com.gabriela.contracts.contractgenerator.service.ContractTemplateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/templates")
public class ContractTemplateController {
    private final ContractTemplateService service;

    public ContractTemplateController(ContractTemplateService service) {
        this.service = service;
    }

    @PostMapping
    public ContractTemplate createContractTemplate(@RequestBody ContractTemplate template) {

        return service.saveTemplate(template);
    }

    @GetMapping
    public List<ContractTemplate> getAllTemplates() {

        return service.getAllTemplates();
    }

    @GetMapping("/{id}")
    public ContractTemplate getTemplateById(@PathVariable Long id) {

        return service.getTemplateById(id);
    }

    @PostMapping("/generate")
    public String generateContract(@RequestBody ContractGenerateRequest  request) {

        return service.generateContract(
                request.getTemplateId(),
                request.getFields()
        );
    }

}
