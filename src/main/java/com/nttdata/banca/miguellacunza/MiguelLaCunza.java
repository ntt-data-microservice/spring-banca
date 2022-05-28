package com.nttdata.banca.miguellacunza;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="miguel_la_cunza")
@Getter
@Setter

public class MiguelLaCunza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "amounts", length = 40, nullable = false)
	private String amount;
}
