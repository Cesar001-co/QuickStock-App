package com.quickstock.quickstock_backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tipos_pago")
@Data
public class TipoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_pago")
    private Long idTipoPago;

    @Column(unique = true, nullable = false)
    private String nombre;
}
