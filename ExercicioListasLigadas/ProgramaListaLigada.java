package ExercicioListasLigadas;

public class ProgramaListaLigada {
    public static void main(String[] args) {
        ListaLigada ll = new ListaLigada();
        ll.adicionar(1);
        ll.adicionar(2);
        ll.adicionar(3);
        ll.adicionar(4);

        System.out.println("Lista original:");
        ll.imprimirLista();

        int n = 3;
        ll.removerPrimeirosNos(n);

        System.out.println("Lista após remover os primeiros " + n + " nós:");
        ll.imprimirLista();
    }
}