package com.quickstock.quickstock_backend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ventas", indexes = @Index(name = "idx_ventas_fecha", columnList = "fecha_apertura"))
@Data
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private Long idVenta;

    @Column(name = "ganancias_total", precision = 15, scale = 2)
    private BigDecimal gananciasTotal = BigDecimal.ZERO;

    @Column(name = "ganancias_utilidad", precision = 15, scale = 2)
    private BigDecimal gananciasUtilidad = BigDecimal.ZERO;

    @Column(name = "ingresos_transferencias", precision = 15, scale = 2)
    private BigDecimal ingresosTransferencias = BigDecimal.ZERO;

    @Column(name = "ingresos_efectivo", precision = 15, scale = 2)
    private BigDecimal ingresosEfectivo = BigDecimal.ZERO;

    @Column(name = "numero_zapatos")
    private Integer numeroZapatos;

    @ManyToOne
    @JoinColumn(name = "id_sucursal", nullable = false)
    @JsonBackReference
    private Sucursal sucursal;

    @Column(name = "fecha_apertura")
    private LocalDateTime fechaApertura;

    @Column(name = "fecha_cierre")
    private LocalDateTime fechaCierre;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoVenta estado = EstadoVenta.ABIERTA;

    @OneToMany(mappedBy = "venta")
    @JsonManagedReference
    private List<VentaProducto> productos = new ArrayList<>();

    public enum EstadoVenta {
        ABIERTA, CERRADA
    }
}
