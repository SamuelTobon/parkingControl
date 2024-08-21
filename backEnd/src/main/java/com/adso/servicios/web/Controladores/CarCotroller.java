package com.adso.servicios.web.Controladores;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adso.servicios.web.Servicios.Interfaces.CarInt;

@RestController
@RequestMapping("/vehiculo")
public class CarCotroller {

    private CarInt servicio;

    @CrossOrigin(origins = "*")
    @GetMapping
    public ResponseEntity<?> listarFactura() {
        return ResponseEntity.ok(servicio.finAll());
    }

}
