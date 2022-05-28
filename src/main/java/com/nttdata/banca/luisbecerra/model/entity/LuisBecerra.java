package com.nttdata.banca.luisbecerra.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "luis_becerra")
@Getter
@Setter
public class LuisBecerra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "type_account", length = 20)
    private String typeAccount;

    @Column(name = "update_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;
}
