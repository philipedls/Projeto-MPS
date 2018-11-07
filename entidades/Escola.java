package entidades;

import java.util.HashMap;
import java.util.Map;

public class Escola {
    private String nome;
    private Endereco endereco;
    private Map<String, Turma> mapTurmas;

    public Escola() {
        this.nome = "";
        this.endereco = new Endereco();
        this.mapTurmas = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Map<String, Turma> getMapTurmas() {
        return mapTurmas;
    }

    public void setMapTurmas(Map<String, Turma> mapTurmas) {
        this.mapTurmas = mapTurmas;
    }
}
