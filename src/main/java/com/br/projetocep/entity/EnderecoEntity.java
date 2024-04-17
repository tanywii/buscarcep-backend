package com.br.projetocep.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "endereco")
public class EnderecoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "cep")
	private String cep;

	@Column(name = "logradouro")
	private String logradouro;

	@Column(name = "cidade")
	private String cidade;

	@Column(name = "bairro")
	private String bairro;

	@Column(name = "uf")
	private String uf;

	@Column(name = "complemento")
	private String complemento;

	@Column(name = "data_hora_consulta")
	private Timestamp dataHoraConsulta;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Timestamp getDataHoraConsulta() {
		return dataHoraConsulta;
	}

	public void setDataHoraConsulta(Timestamp dataHoraConsulta) {
		this.dataHoraConsulta = dataHoraConsulta;
	}

	
}
