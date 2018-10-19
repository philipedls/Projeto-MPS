package utils;

public class HTML implements EstadoEmissorRelatorio {

    @Override
    public void emitirEm(Relatorio r) {
        r.setEmissor(this);
    }

    @Override
    public String toString() {
        return "HTML";
    }
}