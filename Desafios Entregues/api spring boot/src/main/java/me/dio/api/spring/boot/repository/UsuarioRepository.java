package me.dio.api.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.api.spring.boot.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
