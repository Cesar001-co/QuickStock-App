package com.quickstock.quickstock_backend.repository;

import com.quickstock.quickstock_backend.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Obtener producto por REFERENCIA
    List<Producto> findByReferencia(String referencia);

    // Obtener producto por MARCA
    List<Producto> findByMarca(String marca);

    // Obtener producto por SUCURSAL
    List<Producto> findBySucursalId(Long sucursalId);
}
