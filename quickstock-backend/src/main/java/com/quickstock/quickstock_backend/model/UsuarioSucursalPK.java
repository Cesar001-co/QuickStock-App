package com.quickstock.quickstock_backend.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioSucursalId implements Serializable {
    private Long idUsuario;
    private Long idSucursal;
}
