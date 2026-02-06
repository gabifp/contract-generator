package com.gabriela.contracts.contractgenerator.repository;

import com.gabriela.contracts.contractgenerator.entity.ContractTemplate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractTemplateRepository
        extends JpaRepository<ContractTemplate, Long> {

}
