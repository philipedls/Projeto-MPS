package utils;

public class Relatorio {

    private EstadoEmissorRelatorio eer;

    public Relatorio() {}

    public void setEmissor(EstadoEmissorRelatorio eer) {
        this.eer = eer;
    }

    @Override
    public String toString() {
        return "Relatorio{" +
                "Tipo Relatorio=" + eer +
                '}';
    }
}
