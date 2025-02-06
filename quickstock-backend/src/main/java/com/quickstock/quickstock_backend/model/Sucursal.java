package com.quickstock.quickstock_backend.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sucursales")
@Data
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sucursal")
    private Long idSucursal;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String direccion;

    @OneToMany(mappedBy = "sucursal")
    @JsonManagedReference
    private List<TipoProducto> tiposProducto = new ArrayList<>();

    @OneToMany(mappedBy = "sucursal")
    @JsonManagedReference
    private List<Producto> productos = new ArrayList<>();

    @OneToMany(mappedBy = "sucursal")
    @JsonManagedReference
    private List<Venta> ventas = new ArrayList<>();

    @OneToMany(mappedBy = "sucursal")
    @JsonManagedReference
    private List<UsuarioSucursal> usuarios = new ArrayList<>();
}
