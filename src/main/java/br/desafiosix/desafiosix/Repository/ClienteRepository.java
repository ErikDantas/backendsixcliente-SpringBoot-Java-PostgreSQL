package br.desafiosix.desafiosix.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.desafiosix.desafiosix.Model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {
    
}
