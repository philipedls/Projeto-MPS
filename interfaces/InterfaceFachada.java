package interfaces;

import entidades.Aluno;
import entidades.Endereco;
import entidades.Professor;
import entidades.Turma;

import java.util.List;

public interface InterfaceFachada {

    public void matricularAluno(Aluno aluno) throws Exception;
    public void rematricularAluno(Aluno aluno);
    public void excluirMatricula(String matricula);
    public void editarMatricula(String matricula);
    public Aluno verificarMatricula(String matricula);
    public List<String> verificarNotas(String matricula);
    public void gerarBoletim(String matricula);
    public void cadastrarTurma(String nomeDaTurma, List<Professor> professores);
    public void excluirTurma(String nomeDaTurma);
    public void editarTurma(Turma turma);
    public Turma consultarTurma(String nomeDaTurma);
    public void gerarRelatorioDaTurma(Turma turma);
    public void criarEscola(String nomeDaEscola, String endereco);
    public boolean notificarResponsaveis(Endereco nomeDoResponsavel);
    public void cadastrarProfessor(String nome, String matricula, Endereco endereco);
    public void alteracaoDeAlunosEntreTurmas(Aluno aluno, Turma turma, String justificativa);
    public void alteracaoDeProfessoresEntreTurmas(Professor professor, Turma turma, String justificativa);



}
