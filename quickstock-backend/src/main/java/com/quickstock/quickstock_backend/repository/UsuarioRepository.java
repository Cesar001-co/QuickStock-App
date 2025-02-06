package com.quickstock.quickstock_backend.repository;

import com.quickstock.quickstock_backend.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Encontrar por email
    Optional<Usuario> findByEmail(String email);
    
}
