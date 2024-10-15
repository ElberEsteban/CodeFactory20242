package com.sitas.gestionvuelos.entities;

import jakarta.persistence.*;

@Entity
public class TripulacionVuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_tripulante", nullable = false)
    private Tripulacion tripulante;

    @ManyToOne
    @JoinColumn(name = "numero_vuelo", nullable = false)
    private Vuelo vuelo;

    // Getters y setters
    // (Aquí irían los getters y setters)
}
