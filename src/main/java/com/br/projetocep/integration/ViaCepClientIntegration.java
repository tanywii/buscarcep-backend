package com.br.projetocep.integration;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.br.projetocep.domain.CepDomain;

// É A CLASSE QUE SE COMUNICA COM A API DO VIACEP 
public class ViaCepClientIntegration {

	String url = "https://viacep.com.br/ws/parametro/json/";
	
	public CepDomain buscarEndereco(String cepInformado) {
		RestTemplate restTemplate = new RestTemplate();	 // CRIA UM OBJETO DO TIPO RestTemplate
		ResponseEntity<CepDomain> cepDomain  = restTemplate.getForEntity(url.replace("parametro", cepInformado), CepDomain.class); // FAZ A CHAMADA PARA O VIACEP E CAPTURA O RETORNO
		return cepDomain.getBody(); //RETORNA A CLASSE CepDomain COM OS DADOS DO VIACEP
	}
}
