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

import com.adso.servicios.web.Entidades.HistorialTransacciones;
import com.adso.servicios.web.Servicios.Interfaces.HistorialTransaccionesInt;

@RestController
@RequestMapping("/api/historialtransacciones")
public class HistorialTransaccionesController {

    private HistorialTransaccionesInt servicio;

    @CrossOrigin(origins = "*")
    @GetMapping
    public ResponseEntity<?> listHistoryTransaction() {
        return ResponseEntity.ok(servicio.findAll());
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/{id}")
    public ResponseEntity<?> listHistoryTransation(@PathVariable(value = "id") Integer id) {
        Optional<HistorialTransacciones> historial = servicio.findById(id);
        if (historial.isPresent()) {
            return ResponseEntity.ok(historial);
        }
        return ResponseEntity.notFound().build();
    }

    @CrossOrigin(origins = "*")
    @PostMapping
    public ResponseEntity<?> addHistoryTransation(@RequestBody HistorialTransacciones historial) {
        return ResponseEntity.ok(servicio.save(historial));
    }

    @CrossOrigin(origins = "*")
    @PutMapping
    public ResponseEntity<?> editHistoryTransation(@RequestBody HistorialTransacciones historial) {
        return ResponseEntity.ok(servicio.save(historial));
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCarRegister(@PathVariable(value = "id") Integer id) {
        Optional<HistorialTransacciones> hOptional = servicio.findById(id);
        if (hOptional.isPresent()) {
            servicio.delete(id);
            return ResponseEntity.ok(hOptional);

        }
        return ResponseEntity.ok().build();
    }
}
