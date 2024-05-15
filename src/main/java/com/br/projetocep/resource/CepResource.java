package com.br.projetocep.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.br.projetocep.domain.CepDomain;
import com.br.projetocep.entity.EnderecoEntity;
import com.br.projetocep.integration.ViaCepClientIntegration;
import com.br.projetocep.mapper.CepMapper;
import com.br.projetocep.repository.CepRepository;

// ESSA CLASSE TOODA É A ENTRADA DA APLICAÇÃO, OU SEJA, COMEÇA A EXECUTAR PELOS DOIS MÉTODOS (consulta-e-salvar-endereço) (listar-todos)
@RestController
@RequestMapping("/cep")
public class CepResource {
	
	@Autowired
	CepRepository cepRepository;
	
	ViaCepClientIntegration consultaViaCep = new ViaCepClientIntegration();
	
	CepMapper cepMapper = new CepMapper();
	
    @CrossOrigin
	@GetMapping("/consultar-e-salvar-endereco") // ESSA LINHA DIZ QUE É UMA API DO TIPO GET          ENDPOINT (consulta-e-salva-endereço)
	public ResponseEntity<CepDomain> consultarESalvarEndereco(@RequestParam String cep) {
		CepDomain cepDomain = consultaViaCep.buscarEndereco(cep); // CHAMA A CLASSE ViaCepIntegration, QUE BUSCA O CEP LÁ NO VIACEP
		EnderecoEntity enderecoEntity = cepMapper.toEntity(cepDomain); // COLOCA OS VALORES DO OBJETO CepDomain PARA EnderecoEntity
		cepRepository.save(enderecoEntity); // SALVAR NO BANCO DE DADOS VIA JPA 
		return ResponseEntity.ok(cepDomain); // RETORNA UM "OK" DA SUA API
	}

    @CrossOrigin
	@GetMapping("/listar-todos") // ESSA LINHA DIZ QUE É UMA API DO TIPO GET.         ENDPOINT /listar-toodos
	public ResponseEntity<List<EnderecoEntity>> listarTodos() { 
		return ResponseEntity.ok(cepRepository.findAll()); // BUSCA NO BANCO DE DADOS OS ENDEREÇOS E RETORNA UM "OK" DA API 
	}

}
