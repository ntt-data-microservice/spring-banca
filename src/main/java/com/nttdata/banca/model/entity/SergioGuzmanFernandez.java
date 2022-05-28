package com.nttdata.banca.model.entity;

import lombok.Data;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
@Entity
@Table(name="Sergio_Guzman_Fernandez")
@Data
public class SergioGuzmanFernandez {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="type_account",length = 20)
    private String typeAccount;


}
