package com.gabriela.contracts.contractgenerator.service;

import com.gabriela.contracts.contractgenerator.DTO.AddressResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class AddressService {
    private final RestTemplate restTemplate = new RestTemplate();

    public AddressResponse getAddressByCep(String cep) {
        if (!cep.matches("\\d{8}")) {
            throw new IllegalArgumentException("CEP inválido");
        }

        String url = "https://viacep.com.br/ws/" + cep + "/json/";

        // TODO: Evoluir para algo mais elegante e moderno.
        Map<String, Object> response = restTemplate.getForObject(url, Map.class);

        System.out.println(response);

        if (response == null) {
            throw new RuntimeException("CEP não encontrado");
        }

        AddressResponse address = new AddressResponse();

        address.setStreet((String) response.get("logradouro"));
        address.setNeighborhood((String) response.get("bairro"));
        address.setCity((String) response.get("localidade"));
        address.setState((String) response.get("uf"));

        return address;
    }
}
