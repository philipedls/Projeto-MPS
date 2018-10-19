package controle;

import entidades.Usuario;
import interfaces.InterfaceAutenticacaoDao;

import java.io.Serializable;
import java.util.HashSet;


public class Autenticacao implements InterfaceAutenticacaoDao {

    private HashSet<Usuario> usuarios;
    private LoginFacebook loginFacebook;

    private AlunoDao alunoDao;
    private DiretorDao diretorDao;
    private ProfessorDao professorDao;
    private ResponsavelDao responsavelDao;

    public Autenticacao() {
        this.usuarios = new HashSet<Usuario>();

        this.usuarios.addAll(this.alunoDao.getAll());
        this.usuarios.addAll(this.diretorDao.getAll());
        this.usuarios.addAll(this.professorDao.getAll());
        this.usuarios.addAll(this.responsavelDao.getAll());

        this.loginFacebook = new LoginFacebook();
    }
    @Override
    public void login(String login, String senha) {

        for (Usuario usuario : usuarios) {
            if (login == usuario.getLogin() && senha == usuario.getSenha()) {
                System.out.print("LOGIN FEITO!");
            } else {
                System.out.print("Login ou senha incorretos");
            }
        }
    }


    public void loginViaFacebook(String code){
        this.loginFacebook.obterUsuarioFacebook(code);
        System.out.print("LOGIN FEITO!");
    }

}
