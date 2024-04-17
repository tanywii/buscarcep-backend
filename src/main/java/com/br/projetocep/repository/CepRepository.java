package com.br.projetocep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.projetocep.entity.EnderecoEntity;

public interface CepRepository extends JpaRepository<EnderecoEntity, Long>  {

}
