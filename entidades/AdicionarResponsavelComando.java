package entidades;

import controle.Comando;
import controle.ResponsavelDao;

public class AdicionarResponsavelComando implements Comando {
    private ResponsavelDao responsavel;

    public AdicionarResponsavelComando(ResponsavelDao responsavel){
        this.responsavel = responsavel;
    }

    public AdicionarResponsavelComando(){

    }

    @Override
    public Object executar(Object arg) {
        this.responsavel.add((Responsavel) arg);
        return null;
    }
}
