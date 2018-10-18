package entidades;

class Diretor {

    private String nome, telefone;
    private Endereco endereco;
    private Usuario usuario;

    public Diretor() {
        this.nome = "";
        this.telefone = "";
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}