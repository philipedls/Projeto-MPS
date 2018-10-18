package entidades;

import java.util.HashMap;
import java.util.Map;

public class Turma {
    private String nome;
    private Map<String, Professor> professores;
    private Map<String, Aluno> alunos;

    public Turma() {
        this.nome = "";
        this.professores = new HashMap<>();
        this.alunos = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Map<String, Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(Map<String, Professor> professores) {
        this.professores = professores;
    }

    public Map<String, Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Map<String, Aluno> alunos) {
        this.alunos = alunos;
    }
}
