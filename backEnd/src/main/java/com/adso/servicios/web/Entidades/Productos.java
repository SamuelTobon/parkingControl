package com.adso.servicios.web.Entidades;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="productos")
public class Productos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nombre", nullable = false, length = 80)
    @NonNull
    private String nombre;

    @Column(name="precio", nullable = false, length = 11)
    @NonNull
    private int precio;

    @Column(name="vencimiento", nullable = false, length = 10)
    @NonNull
    private String vencimiento;

    /*@Column(name="unidades_id", nullable = false, length = 11)
    @NonNull
    private int unidadesId;*/
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "unidades_id")
    private Unidades unidadesId;


    /*@Column(name="categorias_id", nullable = false, length = 11)
    @NonNull
    private int categoriasId;*/
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "categorias_id")
    private Categorias categoriasId;

    @Column(name="cantidad", nullable = false, length = 11)
    @NonNull
    private int cantidad;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public Unidades getUnidadesId() {
        return unidadesId;
    }

    public void setUnidadesId(Unidades unidadesId) {
        this.unidadesId = unidadesId;
    }

    public Categorias getCategoriasId() {
        return categoriasId;
    }

    public void setCategoriasId(Categorias categoriasId) {
        this.categoriasId = categoriasId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
