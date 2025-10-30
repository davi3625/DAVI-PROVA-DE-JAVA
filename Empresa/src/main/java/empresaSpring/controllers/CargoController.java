package empresaSpring.controllers;

import empresaSpring.entities.Cargo;
import empresaSpring.services.CargoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cargo")
public class CargoController {

    @Autowired
    private CargoService service;

    @GetMapping
    public List<Cargo> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Cargo buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Cargo criar(@RequestBody Cargo cargo) {
        return service.salvar(cargo);
    }

    @PutMapping("/{id}")
    public Cargo atualizar(@PathVariable Long id, @RequestBody Cargo cargo) {
        return service.atualizar(id, cargo);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
