package controle;

public class Autenticacao {

    DaoUsuarios dao;

    public Autenticacao() {
        this.dao = new DaoUsuarios();
    }

    public void login(String login, String senha) {

        for (Usuario usuario : this.dao.getAllUsuarios()) {
            if (username == usuario.getLogin() && senha == usuario.getSenha()) {
                System.out.print("LOGIN FEITO!");
            } else {
                System.out.print("Login ou senha incorretos");
            }
        }



    }
}
