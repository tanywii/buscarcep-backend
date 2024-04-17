package com.br.projetocep.integration;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.br.projetocep.domain.CepDomain;

public class ViaCepClientIntegration {

	String url = "https://viacep.com.br/ws/parametro/json/";
	
	public CepDomain buscarEndereco(String cepInformado) {
		RestTemplate restTemplate = new RestTemplate();		
		ResponseEntity<CepDomain> cepDomain  = restTemplate.getForEntity(url.replace("parametro", cepInformado), CepDomain.class);
		return cepDomain.getBody();
	}
}
