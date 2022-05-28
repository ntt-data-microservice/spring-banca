package com.nttdata.banca.randyaragongonzales.model.entity;

import com.nttdata.banca.account.model.entity.Account;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cards")
@Getter
@Setter
public class RandyAragonGonzales {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "number", length = 16, nullable = false)
  private String number_maxValue;

  @Column(name = "token_1", length = 4, nullable = false)
  private String token_1;

  @OneToMany(mappedBy = "otherEntity", fetch = FetchType.EAGER)
  private List<Account> list_entity;
}
