package entidades;

import controle.Comando;
import controle.ProfessorDao;

public class AdicionarProfessorComando implements Comando {
    private ProfessorDao professor;

    public AdicionarProfessorComando(ProfessorDao professor){
        this.professor = professor;
    }

    public AdicionarProfessorComando(){

    }

    @Override
    public Object executar(Object arg) {
        this.professor.add((Professor) arg);
        return null;
    }
}
