package com.br.projetocep.mapper;

import java.sql.Timestamp;
import java.time.Instant;

import com.br.projetocep.domain.CepDomain;
import com.br.projetocep.entity.EnderecoEntity;

public class CepMapper {

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
