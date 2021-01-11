package com.sabinabernardes.crm.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id ;
	public String nome;
	public String email;
	public String cpf;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	public Date dataNasc;
	
	
	public Cliente () {
		
	}

}
