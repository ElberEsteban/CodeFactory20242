package com.sitas.gestionvuelos.entities;

import jakarta.persistence.*;


@Entity
public class Tripulacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTripulante;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String rol;

    // Getters y setters
    // (Aquí irían los getters y setters)
}
