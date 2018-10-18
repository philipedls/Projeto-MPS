package entidades;

public class Professor {
    private String nome, matricula;
    private Endereco endereco;
    private Usuario usuario;

    public Professor() {
        this.nome = "";
        this.matricula = "";
        this.endereco = new Endereco();
        this.usuario = new Usuario();
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Usuario getUsuario() { return this.usuario; }

    public void setUsuatio(Usuario usuario) { this.usuario = usuario; }
}
