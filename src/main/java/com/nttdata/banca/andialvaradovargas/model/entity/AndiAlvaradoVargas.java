package com.nttdata.banca.andialvaradovargas.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "andi_alvarado_vargas")
@Getter
@Setter
public class AndiAlvaradoVargas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "description", length = 20)
    private String description;

    @Column(name = "age", columnDefinition = "tinyint")
    private Integer age;

    @Column(name = "phone", length = 9)
    private String phone;

    @Column(name = "update_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;

}
