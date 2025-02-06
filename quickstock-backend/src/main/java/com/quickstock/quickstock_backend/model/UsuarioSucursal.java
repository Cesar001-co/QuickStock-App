package com.quickstock.quickstock_backend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "usuario_sucursal")
@Data
public class UsuarioSucursal {
    @EmbeddedId
    private UsuarioSucursalPK id;

    @ManyToOne
    @MapsId("idUsuario")
    @JoinColumn(name = "id_usuario")
    @JsonBackReference
    private Usuario usuario;

    @ManyToOne
    @MapsId("idSucursal")
    @JoinColumn(name = "id_sucursal")
    @JsonBackReference
    private Sucursal sucursal;
}


