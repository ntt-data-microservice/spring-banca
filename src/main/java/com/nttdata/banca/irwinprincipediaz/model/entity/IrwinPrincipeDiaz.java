package com.nttdata.banca.irwinprincipediaz.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Table(name="customer_irwin") //Snake_case
@Data

public class IrwinPrincipeDiaz { //Upper Camel Case

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="type_account",length = 20)
	private String typeAccount;
	
	@Column(name="update_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateAt;
	
	@Column(name="dni",length = 8,unique = true)
	private String dni;
	
	@Column(name="estado_civil",length = 8,nullable = false)
	private String estadoCivil;
	
	
	
}
