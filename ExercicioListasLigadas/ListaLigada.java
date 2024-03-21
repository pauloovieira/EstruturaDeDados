package ExercicioListasLigadas;

public class ListaLigada {

    Node cabeca;

    ListaLigada() {
        this.cabeca = null;
    }

    void adicionar(int novoValor) {
        Node novoNode = new Node(novoValor);
        if (this.cabeca == null) {
            this.cabeca = novoNode;
            return;
        }
        Node ultimoNode = this.cabeca;
        while (ultimoNode.proximo != null) {
            ultimoNode = ultimoNode.proximo;
        }
        ultimoNode.proximo = novoNode;
    }

    Node removerPrimeirosNos(int n) {
        if (this.cabeca == null)
            return null;

        Node atual = this.cabeca;
        for (int i = 0; i < n - 1; i++) {
            if (atual.proximo != null) {
                atual = atual.proximo;
            } else {
                this.cabeca = null;
                return null;
            }
        }

        this.cabeca = atual.proximo;
        return this.cabeca;
    }

    void imprimirLista() {
        Node atual = this.cabeca;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

}
