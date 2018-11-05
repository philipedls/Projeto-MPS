package entidades;

import controle.Memento;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Aluno {
    private String matricula;
    private Date dataNascimento;
    private Map<String, Responsavel> responsaveis;
    private Map<String, Historico> historico;
    private Endereco endereco;
    private Usuario usuario;

    public Aluno() {
        this.matricula = "";
        this.dataNascimento = new Date(0,0,0);
        this.responsaveis = new HashMap<>();
        this.historico = new HashMap<>();
        this.endereco = new Endereco();
        this.usuario = new Usuario();
    }

    private void setAluno(Aluno aluno ) {
        this.matricula = aluno.matricula;
        this.dataNascimento = aluno.dataNascimento;
        this.responsaveis = aluno.responsaveis;
        this.historico = aluno.historico;
        this.endereco = aluno.endereco;
        this.usuario = aluno.usuario;
    }

    public Memento salvaMemento() {
        return new Memento(this);
    }

    public void carregarMemento(Memento memento) {
        this.setAluno((Aluno) memento.getEstado());
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.usuario.getNome();
    }

    public void setNome(String nome) {
        this.usuario.setNome(nome);
    }

    public String getLogin() {
        return this.usuario.getLogin();
    }

    public void setLogin(String nome) {
        this.usuario.setLogin(nome);
    }

    public String getSenha() {
        return this.usuario.getSenha();
    }

    public void setSenha(String senha) {
        this.usuario.setSenha(senha);
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Map<String, Responsavel> getResponsaveis() {
        return this.responsaveis;
    }

    public void setResponsaveis(Map<String, Responsavel> responsaveis) {
        this.responsaveis = responsaveis;
    }

    public Map<String, Historico> getHistorico() {
        return this.historico;
    }

    public void setHistorico(Map<String, Historico> historico) {
        this.historico = historico;
    }

    public Endereco getEndereco() { return this.endereco; }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Usuario getUsuario() { return this.usuario; }

    public void setUsuatio(Usuario usuario) { this.usuario = usuario; }
}

