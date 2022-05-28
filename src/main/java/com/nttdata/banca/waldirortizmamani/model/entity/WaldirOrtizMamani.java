package com.nttdata.banca.waldirortizmamani.model.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "waldir_ortiz_mamani")
@Getter
@Setter
public class WaldirOrtizMamani {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "type_account", length = 20)
    private String typeAccount;

    @Column(name = "update_at") // Snake Case
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;
}
