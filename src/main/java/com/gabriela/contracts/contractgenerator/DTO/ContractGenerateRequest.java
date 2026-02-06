package com.gabriela.contracts.contractgenerator.DTO;

import java.util.Map;

public class ContractGenerateRequest {
     private Long templateId;

     private Map<String, String> fields;

     public Long getTemplateId() {
         return templateId;
     }

     public void setTemplateId(Long templateId) {
         this.templateId = templateId;
     }

     public Map<String, String> getFields() {
         return fields;
     }

     public void setFields(Map<String, String> fields) {
         this.fields = fields;
     }
}
