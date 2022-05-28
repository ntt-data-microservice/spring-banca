package com.nttdata.banca.kevinrojascobenas.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "kevin-rojas-cobenas")
public class KevinRojasCobenas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dni", length = 8, nullable = false, unique = true)
    private String dni;

    @Column(name = "name", length = 75, nullable = false)
    private String name;
    
    @Column(name = "last_name", length = 75, nullable = false)
    private String lastName;
    
    @Column(name = "nickname", length = 100, nullable = true)
    private String nickname;

    @Column(name = "amount", scale = 2, precision = 9, nullable = false)
    private Double amount;

    @Column(name = "date_birth", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date dateBirth;

    @Column(name = "date_register")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRegister;

}
