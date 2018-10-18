package entidades;

public class Responsavel {
    private String nome, telefone, email;

    public String getNome() {
        return nome;
    }

    public Responsavel setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public Responsavel setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Responsavel setEmail(String email) {
        this.email = email;
        return this;
    }

    public Responsavel() {
        this.nome = "";
        this.telefone = "";
        this.email = "";
    }
}
