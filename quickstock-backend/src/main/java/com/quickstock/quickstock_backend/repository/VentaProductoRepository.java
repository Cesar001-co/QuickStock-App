package com.quickstock.quickstock_backend.repository;

import com.quickstock.quickstock_backend.model.VentaProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VentaProductoRepository extends JpaRepository<VentaProducto, Long> {
    // Buscar productos de una venta
    List<VentaProducto> findByVentaId(Long ventaId);

    // Consulta compleja: Total ganado por tipo de pago
    @Query("SELECT vp.tipoPago.nombre, SUM(vp.ganancia) FROM VentaProducto vp GROUP BY vp.tipoPago.nombre")
    List<Object[]> sumGananciasByTipoPago();
}
