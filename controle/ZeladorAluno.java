package controle;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ZeladorAluno {

    private Stack<Memento> estados;

    public ZeladorAluno() {
        this.estados = new Stack<>();
    }

    public void add(Memento aluno) {
        this.estados.push(aluno);
    }

    public Memento ultimaMudanca() {
        return this.estados.pop();
    }
}
