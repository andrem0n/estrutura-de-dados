
public class Pessoa {
    private String nome;
    private String endereco;
    private int telefone;

    public Pessoa(String nome, String endereco, int telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public int getTelefone() {
        return this.telefone;
    }

    @Override
    public String toString() {
        return "" +
            " nome='" + getNome() + "'" +
            ", endereco='" + getEndereco() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ".";
    }
}