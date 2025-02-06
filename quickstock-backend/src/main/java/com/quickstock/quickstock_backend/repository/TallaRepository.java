package com.quickstock.quickstock_backend.repository;

import com.quickstock.quickstock_backend.model.Talla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TallaRepository extends JpaRepository<Talla, Long> {
    // Buscar las tallas del producto
    List<Talla> findByProductoId(Long productoId);

    // Buscar talla de un producto???
    Optional<Talla> findByProductoIdAndTalla(Long productoId, Double talla);
}
