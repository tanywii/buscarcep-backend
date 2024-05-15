package com.br.projetocep.repository; 

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.projetocep.entity.EnderecoEntity;

// ESSA CLASSE É A COMIICAÇÃO ENTRE A CLASSE EnderecoEntity E O Banco de dados 
//APENAS EXTENDE A CLASSE DO JPA E NOS PERMITE USAR MẼTODOS DO JPA
public interface CepRepository extends JpaRepository<EnderecoEntity, Long>  {

}
