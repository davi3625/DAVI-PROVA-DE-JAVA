package empresaSpring.services;



import empresaSpring.entities.Colaborador;
import empresaSpring.repositories.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ColaboradorService {

    @Autowired
    private ColaboradorRepository repo;

    public List<Colaborador> listar() {
        return repo.findAll();
    }

    public Colaborador buscarPorId(Long id) {
        Optional<Colaborador> mat = repo.findById(id);
        return mat.orElse(null);
    }

    public Colaborador salvar(Colaborador colaborador) {
        return repo.save(colaborador);
    }

    public Colaborador atualizar(Long id, Colaborador novo) {
        Colaborador existente = buscarPorId(id);
        if (existente != null) {
            existente.setNome(novo.getNome());
            existente.setCpf(novo.getCpf());
            existente.setId(novo.getId());
            existente.setDatadenascimento(novo.getDatadenascimento());

            return repo.save(existente);
        }
        return null;
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}
