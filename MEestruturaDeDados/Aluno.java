package MEestruturaDeDados;

public class Aluno {

    private String nome;

    public Aluno(java.lang.String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return this.nome;
    }
}
