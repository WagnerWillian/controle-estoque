package controleestoque;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome inválido");
        }
        if (preco <= 0 || !Double.isFinite(preco)) {
            throw new IllegalArgumentException("Preço inválido");
        }

        if(quantidade < 0){
            throw new IllegalArgumentException("Quantidade inválida");
        }

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            return false;
        }
        this.quantidade += quantidade;
        return true;
    }

    public boolean removerEstoque(int quantidade) {
        if (quantidade <= 0 || quantidade > this.quantidade) {
            return false;
        }
        this.quantidade -= quantidade;
        return true;
    }

    public boolean alterarPreco(double novoPreco) {
        if (novoPreco <= 0) {
            return false;
        }
        if(!Double.isFinite(novoPreco)){
            return false;
        }
        if (novoPreco < this.preco * 0.60) {
            return false;
        }
        this.preco = novoPreco;
        return true;
    }
}
