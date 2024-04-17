package com.josepajaro.pruebabj.repositorio;

import com.josepajaro.pruebabj.modelo.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioNota extends JpaRepository<Nota,Long> {
}
