package empresaSpring.controllers;

import empresaSpring.entities.Setor;
import empresaSpring.services.SetorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/setor")
public class SetorController {

    @Autowired
    private SetorService service;

    @GetMapping
    public List<Setor> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Setor buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Setor criar(@RequestBody Setor setor) {
        return service.salvar(setor);
    }

    @PutMapping("/{id}")
    public Setor atualizar(@PathVariable Long id, @RequestBody Setor setor) {
        return service.atualizar(id, setor);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
