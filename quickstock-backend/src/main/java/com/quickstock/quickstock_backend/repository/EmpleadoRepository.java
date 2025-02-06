package com.quickstock.quickstock_backend.repository;

import com.quickstock.quickstock_backend.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    // Encontrar empleado por nombre
    List<Empleado> findByNombreContainingIgnoreCase(String nombre);
}
