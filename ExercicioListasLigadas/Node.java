package ExercicioListasLigadas;

public class Node {
    public int valor;
    public Node proximo;

    public Node(int novoValor) {
        this.valor = novoValor;
        this.proximo = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
}