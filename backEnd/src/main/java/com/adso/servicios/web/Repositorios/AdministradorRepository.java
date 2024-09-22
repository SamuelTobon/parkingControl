package com.adso.servicios.web.Repositorios;

//import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adso.servicios.web.Entidades.Administradores;

public interface AdministradorRepository extends JpaRepository<Administradores, Integer> {

    // Optional<List<Administradores>> findByNombre(String nombre);

    Optional<Administradores> findByEmail(String email);

    Optional<Administradores> findByEmailAndPassword(String email, String password);

}
