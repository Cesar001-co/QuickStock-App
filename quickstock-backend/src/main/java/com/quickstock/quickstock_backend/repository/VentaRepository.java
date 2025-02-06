package com.quickstock.quickstock_backend.repository;

import com.quickstock.quickstock_backend.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {
    // Buscar venta sucursal y estado de la caja
    List<Venta> findBySucursalIdAndEstado(Long sucursalId, Venta.EstadoVenta estado);

    // Buscar venta segun su fecha de apertura
    List<Venta> findByFechaAperturaBetween(LocalDateTime inicio, LocalDateTime fin);
}
