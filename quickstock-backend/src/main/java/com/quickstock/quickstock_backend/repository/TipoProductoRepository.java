package com.quickstock.quickstock_backend.repository;

import com.quickstock.quickstock_backend.model.TipoProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoProductoRepository extends JpaRepository<TipoProducto, Long> {
    // Encontrar tipo de producto por sucursalId
    List<TipoProducto> findBySucursalId(Long sucursalId);
}
