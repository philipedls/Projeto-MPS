package interfaces;

import entidades.*;

import java.util.Map;

public interface InterfaceFachada {

    public void matricularAluno(Aluno aluno) throws Exception;
    public void rematricularAluno(Aluno aluno);
    public void excluirMatricula(String matricula) throws Exception;
    public void editarMatricula(String matricula) throws Exception;
    public String verificarMatricula(String matricula) throws Exception;
    public Map<String, Historico> verificarNotas(String matricula) throws Exception;
    public void gerarBoletim(String matricula);
    public void cadastrarTurma(String nomeDaTurma, Map<String, Professor> professores) throws Exception;
    public void excluirTurma(String nomeDaTurma) throws Exception;
    public void editarTurma(Turma turma);
    public Turma consultarTurma(String nomeDaTurma) throws Exception;

}
