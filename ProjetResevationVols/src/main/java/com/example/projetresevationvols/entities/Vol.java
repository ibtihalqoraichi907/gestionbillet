package com.example.projetresevationvols.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idvol;

    private Date dateDepart;

    private Date dateArrive;

    private String heureDepart;

    private String heureArrive;

    @ManyToOne
    private Aeroport depart;

    @ManyToOne
    private Aeroport arrive;

    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Compagnie compagnie;
}
