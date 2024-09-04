package com.adso.servicios.web.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adso.servicios.web.Entidades.Administradores;
import com.adso.servicios.web.Servicios.Interfaces.AdministradorInt;

public interface AdministradorRepository extends JpaRepository<AdministradorInt, Integer> {
    public void saveAdmin(Administradores administradores);

    public void deleteAdmin(Administradores administradores);
}
