package com.quickstock.quickstock_backend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(
        name = "ventas_productos",
        indexes = @Index(name = "idx_ventas_productos_venta", columnList = "id_venta"))
@Data
public class VentaProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto_venta")
    private Long idProductoVenta;

    @ManyToOne
    @JoinColumn(name = "id_venta", nullable = false)
    @JsonBackReference
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    @JsonBackReference
    private Producto producto;

    @Column(name = "precio_unitario", precision = 10, scale = 2)
    private BigDecimal precioUnitario;

    @Column(name = "tipo_producto")
    private String tipoProducto;

    private String nombre;
    private Double talla;

    @Column(name = "precio_venta", precision = 10, scale = 2)
    private BigDecimal precioVenta;

    @Column(precision = 10, scale = 2)
    private BigDecimal ganancia;

    @ManyToOne
    @JoinColumn(name = "id_tipo_pago", nullable = false)
    @JsonBackReference
    private TipoPago tipoPago;

    @ManyToOne
    @JoinColumn(name = "id_vendedor", nullable = false)
    @JsonBackReference
    private Empleado vendedor;
}
