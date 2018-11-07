import controle.Comando;
import entidades.*;
import interfaces.InterfaceFachada;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fachada implements InterfaceFachada {
    private Map<String, Comando> cmds;
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Turma> turmas;


    public Fachada() {
        cmds = new HashMap<>();
        initComandos();
    }

    private void initComandos() {
        this.cmds.put("AdicionaAluno", new AdicionaAlunoComando());
        this.cmds.put("AdicionaProfessor", new AdicionarProfessorComando());
        this.cmds.put("AdicionaResponsavel", new AdicionarResponsavelComando());
    }

    @Override
    public void matricularAluno(Aluno aluno) throws Exception {
        for (Aluno l: alunos){
            if (l.getMatricula().equalsIgnoreCase(aluno.getMatricula()))
                throw new Exception("Error, Aluno ja cadastrado!");
        }

        alunos.add(aluno);

    }

    @Override
    public void rematricularAluno(Aluno aluno) {

    }

    @Override
    public void excluirMatricula(String matricula) throws Exception {
        for (Aluno l : alunos){
            if (l.getMatricula().equalsIgnoreCase(matricula) && !l.isBloqueado()){
                l.setBloqueado(true);
                return;
            }
        }

        throw  new Exception("Aluno ja esta bloqueado ou nao foi localizado!");
    }

    @Override
    public void editarMatricula(String matricula) throws Exception{
       for (Aluno l : alunos){
           if (l.getMatricula().equalsIgnoreCase(matricula));
               //Operaçao de Ediçao de Matricula
       }

       throw new Exception("Aluno nao localizado!");

    }

    @Override
    public String verificarMatricula(String matricula){
        for (Aluno l : alunos){
            if (l.getMatricula().equalsIgnoreCase(matricula)){
                return l.toString();
            }

        }
        return "Aluno nao matriculado!";
    }

    @Override
    public Map<String, Historico> verificarNotas(String matricula) throws Exception{
        for (Aluno l : alunos){
            if (l.toString().equalsIgnoreCase(matricula)){
                return l.getHistorico();
            }
        }
        throw new Exception("Aluno nao localizado!");
    }

    @Override
    public void gerarBoletim(String matricula) {

    }

    @Override
    public void cadastrarTurma(String nomeDaTurma, Map<String, Professor> professores) throws Exception {
        for (Turma t : turmas){
            if (t.getNome().equalsIgnoreCase(nomeDaTurma)){
                throw new Exception("Turma ja Cadastrada!");

            }
        }

        Turma turma = new Turma();
        turma.setProfessores(professores);
        turmas.add(turma);
    }

    @Override
    public void excluirTurma(String nomeDaTurma) throws Exception{
        for (Turma t : turmas){
            if (t.getNome().equalsIgnoreCase(nomeDaTurma))
                turmas.remove(t);
                return;
        }

        throw new Exception("Turma nao localizada!");
    }

    @Override

    public void editarTurma(Turma turma) {
        for (Turma t : turmas){
            if (t.getNome().equalsIgnoreCase(turma.getNome()));
            //Operaçoes de Ediçoes em uma Turma
        }




    }

    @Override
    public Turma consultarTurma(String nomeDaTurma) throws Exception{
        for (Turma t : turmas){
            if (t.getNome().equalsIgnoreCase(nomeDaTurma)){
                return t;
            }
        }
        throw new Exception("Turma nao localizada!");
    }

    @Override
    public void cadastrarProfessor(String nome, String matricula, Endereco endereco) throws Exception {
        for (Professor p: professores){
            if (p.getMatricula().equalsIgnoreCase(nome))
                throw new Exception("Error, Professor ja cadastrado!");
        }

        Professor professor = new Professor();
        professor.setNome(nome);
        professor.setMatricula(matricula);
        professor.setEndereco(endereco);
        professores.add(professor);
    }

}
