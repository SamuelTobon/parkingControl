package com.adso.servicios.web.Entidades;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "administradores")
public class Administradores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdministrador;

    /*
     * @Column(name = "nombre", nullable = false, length = 45)
     * 
     * @NonNull
     * private String nombre;
     */
    @Column(name = "contraseña", nullable = false, length = 255)
    @NonNull
    private String password;

    @Column(name = "email", nullable = false, length = 100)
    @NonNull
    private String email;

    // Getters y Setters
    public Integer getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    /*
     * public String getNombre() {
     * return nombre;
     * }
     * 
     * public void setNombre(String nombre) {
     * this.nombre = nombre;
     * 
     * }
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
