package com.quickstock.quickstock_backend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(
        name = "productos",
        indexes = {
        @Index(name = "idx_productos_referencia", columnList = "referencia"),
        @Index(name = "idx_productos_marca", columnList = "marca")}
)
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;

    @Column(nullable = false)
    private String referencia;

    @Column(nullable = false)
    private String marca;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String color;

    private String altura;

    @Column(name = "precio_compra", nullable = false, precision = 10, scale = 2)
    private BigDecimal precioCompra;

    @Column(nullable = false)
    private Integer cantidad = 0;

    @ManyToOne
    @JoinColumn(name = "id_tipo", nullable = false)
    @JsonBackReference
    private TipoProducto tipoProducto;

    @ManyToOne
    @JoinColumn(name = "id_sucursal", nullable = false)
    @JsonBackReference
    private Sucursal sucursal;

    @OneToMany(mappedBy = "producto")
    @JsonManagedReference
    private List<Talla> tallas = new ArrayList<>();

    @OneToMany(mappedBy = "producto")
    @JsonManagedReference
    private List<VentaProducto> ventasProductos = new ArrayList<>();
}
