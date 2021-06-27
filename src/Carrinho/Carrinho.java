package Carrinho;

public class Carrinho {
    private int qtdMaxima;
    private int quantidade;
    private int inseridos;
    private int removidos;
    private double preco_unitario;

    public Carrinho (int qtdMaxima,double preco_unitario){
        this.qtdMaxima = qtdMaxima;
        this.preco_unitario = preco_unitario;
    }

    public void printCarrinho(){
        System.out.println("Qtd. máxima de itens no carrinho = " + qtdMaxima);
        System.out.printf ("  - Preço unitário de cada item      = R$ %.2f\n", preco_unitario);
    }

    public void inserir(){
        assert	(quantidade < qtdMaxima ): String.format("Inclusão: carrinho cheio, já com %d itens.\n", quantidade); //PRE CONDICAO
        quantidade++;
        inseridos++;
        assert (quantidade == inseridos - removidos ); // INVARIANTE
    }

    public void remover(){
        assert quantidade > 0 : "Remoção: carrinho vazio, não é possível retirar mais itens."; // PRE CONDICAO
        quantidade--;
        removidos++;
        assert quantidade == inseridos - removidos: quantidade != removidos;

    }

    public int getQuantidade() {
        return quantidade;
    }
    public double totalizar(double precoMaximo){
        double precoTotal = preco_unitario * quantidade;
        assert (precoTotal <= precoMaximo) : String.format("Valor insuficiente: R$.2f para gastar foi utrapassado\n", precoMaximo);
        return precoTotal;

    }

}
