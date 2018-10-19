package utils;

public class XLS implements EstadoEmissorRelatorio {

    @Override
    public String toString() {
        return "XLF";
    }

    @Override
    public void emitirEm(Relatorio r) {
        r.setEmissor(this);
    }
}
