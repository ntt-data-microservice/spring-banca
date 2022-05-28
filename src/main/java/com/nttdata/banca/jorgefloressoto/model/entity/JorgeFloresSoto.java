package com.nttdata.banca.jorgefloressoto.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="jorge_flores_soto")
@Getter
@Setter
public class JorgeFloresSoto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "ciudad",length = 30,nullable = false)
    private String ciudad;

    @Column(name= "deporte", length = 30)
    private String deporte;

    @Column(name = "estado_civil",length = 20)
    private String estadoCivil;

    @Column(name = "update_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;


}
