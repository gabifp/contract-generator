package com.gabriela.contracts.contractgenerator.service;

import com.gabriela.contracts.contractgenerator.DTO.ContractResponse;
import com.gabriela.contracts.contractgenerator.entity.ContractTemplate;
import com.gabriela.contracts.contractgenerator.repository.ContractTemplateRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ContractTemplateService {
    private final ContractTemplateRepository repository;

    public ContractTemplateService(ContractTemplateRepository repository) {

        this.repository = repository;
    }

    public ContractTemplate saveTemplate(ContractTemplate template) {

        return repository.save(template);
    }

    public List<ContractTemplate> getAllTemplates() {

        return repository.findAll();
    }

    public ContractTemplate getTemplateById(Long id) {

        return repository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Contract template with id " + id + " not found"));
    }

    public ContractResponse generateContract(Long templateId, Map<String, String> fields) {
        ContractTemplate template = getTemplateById(templateId);

        String generatedContent = applyFields(
                template.getContent(),
                fields
        );

        return new ContractResponse(
                template.getId(),
                generatedContent
        );
    }

    private String applyFields(
            String templateContent,
            Map<String, String> fields
    ) {
        String result = templateContent;

        for(Map.Entry<String, String> entry : fields.entrySet()) {
            result = result.replace(
                    "{{" + entry.getKey() + "}}",
                    entry.getValue());
        }

        return result;
    }
}
