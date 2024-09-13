package com.adso.servicios.web.Controladores;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.adso.servicios.web.Entidades.Factura;
import com.adso.servicios.web.Servicios.Interfaces.FacturaInt;

@RestController
@RequestMapping("/api/factura")
public class FacturaController {

    @Autowired
    private FacturaInt servicio;

    @CrossOrigin(origins = "*")
    @GetMapping
    public ResponseEntity<?> listarFactura() {
        return ResponseEntity.ok(servicio.findAll());
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/{id}")
    public ResponseEntity<?> listarFacturaById(@PathVariable(value = "id") Integer id) {
        Optional<Factura> factura = servicio.findById(id);

        if (factura.isPresent()) {
            return ResponseEntity.ok(id);
        }
        return ResponseEntity.notFound().build();
    }

    @CrossOrigin(origins = "*")
    @PostMapping
    public ResponseEntity<?> crearFactura(@RequestBody Factura factura) {
        return (ResponseEntity<?>) ResponseEntity.ok(factura);

    }

    @CrossOrigin(origins = "*")
    @PutMapping
    public ResponseEntity<?> editarFactura(@RequestBody Factura factura) {
        return (ResponseEntity<?>) ResponseEntity.ok();
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable(value = "id") Integer id) {
        Optional<Factura> faOptional = servicio.findById(id);
        if (faOptional.isPresent()) {
            servicio.delete(id);
            return ResponseEntity.ok(faOptional);
        }
        return ResponseEntity.notFound().build();
    }
}
