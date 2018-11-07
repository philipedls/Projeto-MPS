import controle.Comando;
import entidades.*;
import interfaces.InterfaceFachada;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fachada implements InterfaceFachada {
    private Map<String, Comando> cmds;
    private List<Aluno> alunos;


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
    public void excluirMatricula(String matricula) {

    }

    @Override
    public void editarMatricula(String matricula) {

    }

    @Override
    public Aluno verificarMatricula(String matricula) {
        return null;
    }

    @Override
    public List<String> verificarNotas(String matricula) {
        return null;
    }

    @Override
    public void gerarBoletim(String matricula) {

    }

    @Override
    public void cadastrarTurma(String nomeDaTurma, List<Professor> professores) {

    }

    @Override
    public void excluirTurma(String nomeDaTurma) {

    }

    @Override
    public void editarTurma(Turma turma) {

    }

    @Override
    public Turma consultarTurma(String nomeDaTurma) {
        return null;
    }

    @Override
    public void gerarRelatorioDaTurma(Turma turma) {

    }

    @Override
    public void criarEscola(String nomeDaEscola, String endereco) {

    }

    @Override
    public boolean notificarResponsaveis(Endereco nomeDoResponsavel) {
        return false;
    }

    @Override
    public void cadastrarProfessor(String nome, String matricula, Endereco endereco) {

    }

    @Override
    public void alteracaoDeAlunosEntreTurmas(Aluno aluno, Turma turma, String justificativa) {

    }

    @Override
    public void alteracaoDeProfessoresEntreTurmas(Professor professor, Turma turma, String justificativa) {

    }
}
