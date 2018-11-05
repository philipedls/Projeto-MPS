package entidades;

import controle.AlunoDao;
import controle.Comando;

public class AdicionaAlunoComando implements Comando {

    private AlunoDao ad;

    public AdicionaAlunoComando(AlunoDao ad) {
        this.ad = ad;
    }

    @Override
    public Object executar(Object arg) {
        this.ad.add((Aluno) arg);
        return null;
    }
}
