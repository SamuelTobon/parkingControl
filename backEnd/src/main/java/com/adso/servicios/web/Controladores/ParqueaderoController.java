package com.adso.servicios.web.Controladores;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adso.servicios.web.Entidades.Parqueadero;
import com.adso.servicios.web.Servicios.Interfaces.ParqueaderoInt;

@RestController

@RequestMapping("/parqueadero")
public class ParqueaderoController {
    private ParqueaderoInt servicio;

    @CrossOrigin(origins = "*")
    @GetMapping
    public ResponseEntity<?> listarParqueadero() {
        return ResponseEntity.ok(servicio.findAll());
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/{id}")
    public ResponseEntity<?> listarParqueaderoById(@PathVariable Integer id) {
        Optional<Parqueadero> parqueadero = Optional.empty();
        if (parqueadero.isPresent()) {
            return ResponseEntity.ok(servicio.findById(id));
        }
        return ResponseEntity.notFound().build();
    }

    @CrossOrigin(origins = "*")
    @PostMapping
    public ResponseEntity<?> crearParqueadero(@RequestBody Parqueadero parqueadero) {
        return ResponseEntity.ok(servicio.save(parqueadero));

    }

    @CrossOrigin(origins = "*")
    @PutMapping
    public ResponseEntity<?> editarParqueadero(@RequestBody Parqueadero parqueadero) {
        return ResponseEntity.ok(servicio.save(parqueadero));
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarParqueadero(@PathVariable Integer id) {
        Optional<Parqueadero> parqueadero = Optional.empty();
        if (parqueadero.isPresent()) {
            servicio.delete(parqueadero.get());

        }
        return ResponseEntity.ok().build();
    }
}