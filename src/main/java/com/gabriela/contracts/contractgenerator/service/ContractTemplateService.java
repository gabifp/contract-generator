package com.gabriela.contracts.contractgenerator.service;

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

    public String generateContract(Long templateId, Map<String, String> fields) {
        ContractTemplate template = getTemplateById(templateId);

        String content = template.getContent();

        for (Map.Entry<String, String> entry : fields.entrySet()) {
            String placeholder = "{{" + entry.getKey() + "}}";
            String value = entry.getValue();

            content = content.replace(placeholder, value);
        }

        return content;
    }
}
