package utils;

public class XML implements EstadoEmissorRelatorio {

    @Override
    public void emitirEm(Relatorio r) {
        r.setEmissor(this);
    }

    @Override
    public String toString() {
        return "XML";
    }
}
