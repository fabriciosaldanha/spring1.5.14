package br.mp.mppa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.mp.mppa.domain.Entrada;

@Repository
public interface EntradaRepository extends JpaRepository<Entrada, Long> {

}
