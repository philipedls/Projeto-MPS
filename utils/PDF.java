package utils;

public class PDF implements EstadoEmissorRelatorio {

    @Override
    public String toString() {
        return "PDF";
    }

    @Override
    public void emitirEm(Relatorio r) {
        r.setEmissor(this);
    }
}
