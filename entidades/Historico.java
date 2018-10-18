package entidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Historico {
    private int ano, id;
    private List<Integer> notas;
    private Map<String, Disciplina> disciplinas;

    public int getAno() {
        return ano;
    }

    public Historico setAno(int ano) {
        this.ano = ano;
        return this;
    }

    public int getId() {
        return id;
    }

    public Historico setId(int id) {
        this.id = id;
        return this;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public Historico setNotas(List<Integer> notas) {
        this.notas = notas;
        return this;
    }

    public Map<String, Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public Historico setDisciplinas(Map<String, Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
        return this;
    }

    public Historico() {
        this.ano = 0000;
        this.id = 0000;
        this.notas = new ArrayList<>();
        this.disciplinas = new HashMap<>();
    }
}
