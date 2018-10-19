package controle;

import entidades.Usuario;
import interfaces.InterfaceAutenticacaoDao;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Autenticacao implements InterfaceAutenticacaoDao {

    private Map<String, Usuario> usuarios;
    private LoginFacebook loginFacebook;

    private AlunoDao alunoDao;
    private DiretorDao diretorDao;
    private ProfessorDao professorDao;
    private ResponsavelDao responsavelDao;

    public Autenticacao() {
        this.usuarios = new HashMap<String, Usuario>();

        this.usuarios.putAll(this.alunoDao.getAll());
        this.usuarios.putAll(this.diretorDao.getAll());
        this.usuarios.putAll(this.professorDao.getAll());
        this.usuarios.putAll(this.responsavelDao.getAll());

        this.loginFacebook = new LoginFacebook();
    }
    @Override
    public void login(String login, String senha) {

        Set<String> chaves = usuarios.keySet();

        for (String chave : chaves)
            if (login == usuarios.get(chave).getLogin() && senha == usuarios.get(chave).getSenha()) {
                System.out.print("LOGIN FEITO!");
            } else {
                System.out.print("Login ou senha incorretos");
            }
    }


    public void loginViaFacebook(String code){
        this.loginFacebook.obterUsuarioFacebook(code);
        System.out.print("LOGIN FEITO!");
    }

}
