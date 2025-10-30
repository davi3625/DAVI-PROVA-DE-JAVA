package empresaSpring.repositories;


import empresaSpring.entities.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {
    Optional<Colaborador> findByColaborador(String nome);
}
