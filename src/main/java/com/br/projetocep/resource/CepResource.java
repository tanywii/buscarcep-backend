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

@RestController
@RequestMapping("/cep")
public class CepResource {
	
	@Autowired
	CepRepository cepRepository;
	
	ViaCepClientIntegration consultaViaCep = new ViaCepClientIntegration();
	
	CepMapper cepMapper = new CepMapper();
	
    @CrossOrigin
	@GetMapping("/consultar-e-salvar-endereco")
	public ResponseEntity<CepDomain> consultarESalvarEndereco(@RequestParam String cep) {
		CepDomain cepDomain = consultaViaCep.buscarEndereco(cep);
		EnderecoEntity enderecoEntity = cepMapper.toEntity(cepDomain);
		cepRepository.save(enderecoEntity);
		return ResponseEntity.ok(cepDomain); 
	}

    @CrossOrigin
	@GetMapping("/listar-todos")
	public ResponseEntity<List<EnderecoEntity>> listarTodos() {
		return ResponseEntity.ok(cepRepository.findAll()); 
	}

}
