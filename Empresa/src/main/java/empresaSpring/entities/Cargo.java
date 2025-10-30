package empresaSpring.entities;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name ="tb_cargo")
public class Cargo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String funcao;

    public Cargo() {}


    public Cargo(long id, String nome, String funcao) {
        this.id = id;
        this.nome = nome;
        this.funcao = funcao;
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

    public String getFuncao() {
        return funcao;
    }

    public void setFuncaoa(String funcao) {
        this.funcao = funcao;
    }
}
