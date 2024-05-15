package com.br.projetocep.mapper;

import java.sql.Timestamp;
import java.time.Instant;

import com.br.projetocep.domain.CepDomain;
import com.br.projetocep.entity.EnderecoEntity;

// CLASSE USADA PARA TRANSFORMAR A CLASSE CepDomain EM EnderecoEntity (a classe que tem as anotacoes) 
public class CepMapper {

	// ESSE MÉTODO ABAIXO PEGA OS VALORES DA CLASSE CepDomain E JOGA PARA A CLASSE EnderecoEntity
	// FAZEMOS ISSO PORQUE A CLASSE EnderecoEntity É A QUE SE COMUNICA COM O BANCO DE DADOS VIA JPA, USANDO ANOTACOES @Colimn E @Table 
	public EnderecoEntity toEntity(CepDomain cepDomain) {
		EnderecoEntity enderecoEntity = new EnderecoEntity();
		enderecoEntity.setCep(cepDomain.getCep());
		enderecoEntity.setBairro(cepDomain.getBairro());
		enderecoEntity.setCidade(cepDomain.getLocalidade());
		enderecoEntity.setComplemento(cepDomain.getComplemento());
		enderecoEntity.setDataHoraConsulta(Timestamp.from(Instant.now()));
		enderecoEntity.setUf(cepDomain.getUf());
		enderecoEntity.setLogradouro(cepDomain.getLogradouro());
		return enderecoEntity;
	}
}
