package empresaSpring.config;


import empresaSpring.entities.Cargo;
import empresaSpring.entities.Colaborador;
import empresaSpring.entities.Setor;
import empresaSpring.repositories.CargoRepository;
import empresaSpring.repositories.ColaboradorRepository;
import empresaSpring.repositories.SetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ColaboradorRepository

    @Autowired
    private SetorRepository setorRepository;

    @Autowired
    private CargoRepository cargoRepository;

    @Autowired
    private



    @Override
    public void run(String... args) throws Exception {

        // Colaborador
       Colaborador p1 = new Colaborador(10, "josé", "444-555-555-444", "2005-09-15");
       Colaborador p2 = new Colaborador(10, "josé", "444-555-555-444", );

        // Cargo
        Cargo a1 = new Cargo(10, "João Pedro","gerente" );
        Cargo a2 = new Cargo(1, "João freitas","finanças" );
        cargoRepository.saveAll(Arrays.asList(a1, a2));

        // Setor
        Setor d1 = new Setor(1, "Raul");
        Setor d2 = new Setor(2, "Mauricio");
        setorRepository.saveAll(Arrays.asList(d1, d2));



        System.out.println("✅ Dados de teste inseridos com sucesso!");
    }
}
