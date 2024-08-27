package com.adso.servicios.web.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adso.servicios.web.Entidades.Vehiculo;
import com.adso.servicios.web.Servicios.Interfaces.VehiculoInt;

public interface VehiculoRepositoy extends JpaRepository<VehiculoInt, Integer> {
    public void saveCar(Vehiculo car);

    public void deleteCar(Vehiculo car);

}
