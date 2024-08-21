package com.adso.servicios.web.Entidades;

import java.time.LocalDate;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "factura")
public class factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_factura;

    @NonNull
    @Column(name = "total_hora", nullable = false, length = 11)
    private int totalhora;

    @NonNull
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @NonNull
    @Column(name = "total", nullable = false, length = 11)
    private int total;
}
