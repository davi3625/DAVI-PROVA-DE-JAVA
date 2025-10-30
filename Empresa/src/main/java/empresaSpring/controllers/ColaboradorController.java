package empresaSpring.controllers;


import empresaSpring.entities.Colaborador;
import empresaSpring.services.ColaboradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/colaborador")
public class ColaboradorController {

    @Autowired
    private ColaboradorService service;

    @GetMapping
    public List<Colaborador> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Colaborador buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Colaborador criar(@RequestBody Colaborador colaborador) {
        return service.salvar(colaborador);
    }

    @PutMapping("/{id}")
    public Colaborador atualizar(@PathVariable Long id, @RequestBody Colaborador colaborador) {
        return service.atualizar(id, colaborador);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}



