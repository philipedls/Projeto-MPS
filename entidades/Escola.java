package entidades;

import java.util.HashMap;
import java.util.Map;

public class Escola {
    private String nome;
    private Escola escola;
    private Endereco endereco;
    private Map<String, Turma> mapTurmas;

    public Escola() {
        this.nome = "";
        this.escola = new Escola();
        this.endereco = new Endereco();
        this.mapTurmas = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
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
