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
import com.adso.servicios.web.Entidades.Unidades;
import com.adso.servicios.web.Servicios.Interfaces.UnidadesInt;

@RestController
@RequestMapping("/api/unidades")
public class UnidadesControlador {

    @Autowired
    private UnidadesInt servicio;

    @CrossOrigin(origins = "*")
    @GetMapping
    public ResponseEntity<?> listarCategorias(){
        return ResponseEntity.ok(servicio.findAll());
    }
    
    @CrossOrigin(origins = "*")
    @GetMapping("/{id}")
    public ResponseEntity<?> listarCategoriaById(@PathVariable(value="id") Integer id){
        Optional<Unidades> unidad = servicio.findById(id);
        if(unidad.isPresent()){
            return ResponseEntity.ok(unidad);
        } 
        return ResponseEntity.notFound().build();
    }

    @CrossOrigin(origins = "*")
    @PostMapping
    public ResponseEntity<?> crearCategoria(@RequestBody Unidades unidad){
        return ResponseEntity.ok(servicio.save(unidad));
    }

    @CrossOrigin(origins = "*")
    @PutMapping
    public ResponseEntity<?> editarCategoria(@RequestBody Unidades unidad){
        return ResponseEntity.ok(servicio.save(unidad));
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable(value="id") Integer id){
        Optional<Unidades> unidad = servicio.findById(id);
        if(unidad.isPresent()){
            servicio.delete(id);
            return ResponseEntity.ok(unidad);
        } 
        return ResponseEntity.notFound().build();
    }

}
