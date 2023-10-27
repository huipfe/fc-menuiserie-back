package fr.studi.menuiserie.pojo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Avis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long avis_id;

    private String pseudo;

    private String is_approved;

    private String is_archived;

    private String description;

    private String note;



}
