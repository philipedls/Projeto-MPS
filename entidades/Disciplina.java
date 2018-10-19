package entidades;

public class Disciplina {
    private String nome, ementa, referenciasBilbiograficas;
    private Turma turma;

    public Disciplina() {
        this.nome = "";
        this.ementa = "";
        this.referenciasBilbiograficas = "";
        this.turma = new Turma();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getReferenciasBilbiograficas() {
        return referenciasBilbiograficas;
    }

    public void setReferenciasBilbiograficas(String referenciasBilbiograficas) {
        this.referenciasBilbiograficas = referenciasBilbiograficas;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
