package com.adso.servicios.web.Controladores;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adso.servicios.web.Servicios.Interfaces.VehiculoInt;

@RestController
@RequestMapping("/vehiculo")
public class VehiculoController {

    private VehiculoInt servicio;

    @CrossOrigin(origins = "*")
    @GetMapping
    public ResponseEntity<?> listarCar() {
        return ResponseEntity.ok(servicio.finAll());
    }

}
