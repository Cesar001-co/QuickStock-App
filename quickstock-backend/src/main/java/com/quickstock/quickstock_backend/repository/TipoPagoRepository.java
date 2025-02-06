package com.quickstock.quickstock_backend.repository;

import com.quickstock.quickstock_backend.model.TipoPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TipoPagoRepository extends JpaRepository<TipoPago, Long> {
    // Obtener tipo de pago por nombre?
    Optional<TipoPago> findByNombre(String nombre);
}
