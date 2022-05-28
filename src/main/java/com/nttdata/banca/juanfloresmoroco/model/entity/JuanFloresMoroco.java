package com.nttdata.banca.juanfloresmoroco.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "juan_flores_moroco") // Snake Case
@Getter
@Setter
public class JuanFloresMoroco { // Upper Camel Case
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "type_account", length = 20)
  private String typeAccount;

  @Column(name = "update_at")
  @Temporal(TemporalType.TIMESTAMP)
  private Date updateAt;
}
