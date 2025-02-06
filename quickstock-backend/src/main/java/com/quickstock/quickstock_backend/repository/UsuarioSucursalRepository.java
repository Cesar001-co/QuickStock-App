package com.quickstock.quickstock_backend.repository;

import com.quickstock.quickstock_backend.model.Sucursal;
import com.quickstock.quickstock_backend.model.Usuario;
import com.quickstock.quickstock_backend.model.UsuarioSucursal;
import com.quickstock.quickstock_backend.model.UsuarioSucursalPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioSucursalRepository extends JpaRepository<UsuarioSucursal, UsuarioSucursalPK> {
    // Buscar sucursales de un usuario
    @Query("SELECT us.sucursal FROM UsuarioSucursal us WHERE us.usuario.idUsuario = :usuarioId")
    List<Sucursal> findSucursalesByUsuarioId(@Param("usuarioId") Long usuarioId);

    // Buscar usuarios de una sucursal
    @Query("SELECT us.usuario FROM UsuarioSucursal us WHERE us.sucursal.idSucursal = :sucursalId")
    List<Usuario> findUsuariosBySucursalId(@Param("sucursalId") Long sucursalId);
}
