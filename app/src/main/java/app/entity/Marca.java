package app.entity;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String cnpj;
    
    @OneToMany(mappedBy = "marca")
    private List<Carro> carros;

    // Construtor padrão
    public Marca() {}

    // Construtor com parâmetros
    public Marca(long id, String nome, String cnpj, List<Carro> carros) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.carros = carros;
    }

    // Getters e Setters
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
