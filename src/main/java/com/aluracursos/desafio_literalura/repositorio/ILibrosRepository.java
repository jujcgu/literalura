package com.aluracursos.desafio_literalura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aluracursos.desafio_literalura.models.Libros;

import java.util.List;

public interface ILibrosRepository extends JpaRepository<Libros, Long> {
    Libros findByTitulo(String titulo);

    List<Libros> findByLenguajesContaining(String lenguaje);
}
