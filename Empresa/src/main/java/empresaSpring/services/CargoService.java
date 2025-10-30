package empresaSpring.services;

import empresaSpring.entities.Cargo;
import empresaSpring.repositories.CargoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CargoService {

    @Autowired
    private CargoRepository repo;

    public List<Cargo> listar() {
        return repo.findAll();
    }

    public Cargo buscarPorId(Long id) {
        Optional<Cargo> mat = repo.findById(id);
        return mat.orElse(null);
    }

    public Cargo salvar(Cargo cargo) {
        return repo.save(cargo);
    }

    public Cargo atualizar(Long id, Cargo novo) {
        Cargo existente = buscarPorId(id);
        if (existente != null) {
            existente.setNome(novo.getNome());
            existente.setFuncaoa(novo.getFuncao());
            existente.setId(novo.getId());

            return repo.save(existente);
        }
        return null;
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}
