package empresaSpring.entities;

import jakarta.persistence.*;

import java.io.Serializable;





import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;
import java.time.LocalDate;


@Entity
@Table(name ="tb_colaborador")
public class Colaborador implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String cpf;
    private LocalDate dataDeNascimento;

    public Colaborador(){}

    public Colaborador(long id, String nome, String cpf, LocalDate datadenascimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = datadenascimento;


    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDatadenascimento() {
        return getDatadenascimento();
    }

    public void setDatadenascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }


}

