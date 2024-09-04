package com.adso.servicios.web.Controladores;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adso.servicios.web.Entidades.Administradores;
import com.adso.servicios.web.Servicios.Interfaces.AdministradorInt;

@RestController
@RequestMapping("/administradores")
public class AdminController {

    private AdministradorInt servicio;

    @CrossOrigin(origins = "*")
    @GetMapping
    public ResponseEntity<?> listarAdmin() {
        return ResponseEntity.ok(servicio.finAll());

    }

    @CrossOrigin(origins = "*")
    @GetMapping("/{id}")
    public ResponseEntity<?> listarAdminById(@PathVariable Integer id) {
        Optional<Administradores> admin = Optional.empty();
        if (admin.isPresent()) {
            return ResponseEntity.ok(servicio.findById(id));
        }
        return ResponseEntity.notFound().build();
    }

    @CrossOrigin(origins = "*")
    @PostMapping
    public ResponseEntity<?> crearAdmin(@RequestBody Administradores administrador) {
        return (ResponseEntity<?>) ResponseEntity.ok(administrador);

    }
}
