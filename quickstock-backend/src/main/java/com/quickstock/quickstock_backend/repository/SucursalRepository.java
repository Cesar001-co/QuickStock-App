package com.quickstock.quickstock_backend.repository;

import com.quickstock.quickstock_backend.model.Sucursal;
import com.quickstock.quickstock_backend.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SucursalRepository extends JpaRepository<Sucursal, Long> {
}
