package com.nttdata.banca.marcoantonioquiniamamani.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "marco_antonio_quinia_mamani")
@Getter
@Setter
public class MarcoAntonioQuiniaMamani {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "type_account", length = 20)
    private String typeAccount;

    @Column(name = "update_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;
}
