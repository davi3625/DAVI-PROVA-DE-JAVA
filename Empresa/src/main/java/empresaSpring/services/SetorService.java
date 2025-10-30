package empresaSpring.services;

import empresaSpring.entities.Setor;
import empresaSpring.repositories.SetorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SetorService {

    @Autowired
    private SetorRepository repo;

    public List<Setor> listar() {
        return repo.findAll();
    }

    public Setor buscarPorId(Long id) {
        Optional<Setor> nota = repo.findById(id);
        return nota.orElse(null);
    }

    public Setor salvar(Setor setor) {
        return repo.save(setor);
    }

    public Setor atualizar(Long id, Setor setor) {
        Setor existente = buscarPorId(id);
        if (existente != null) {
            existente.setNome(setor.getNome());
            existente.setId(setor.getId());;


            return repo.save(existente);
        }
        return null;
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}
