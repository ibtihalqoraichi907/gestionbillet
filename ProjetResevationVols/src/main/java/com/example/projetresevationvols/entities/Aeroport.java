package com.example.projetresevationvols.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Aeroport {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String nom;

    @OneToMany(mappedBy = "depart")
    private List<Vol> departList = new ArrayList<>();

    @OneToMany(mappedBy = "arrive")
    private List<Vol> arriveList = new ArrayList<>();
}
