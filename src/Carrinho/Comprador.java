package Carrinho;

public class Comprador {
    private String nome;
    private double valornaCarteira;
    private Carrinho carrinho;

    public Comprador(String nome, double valornaCarteira, int quanidadoCarrinho, double precoUnitario) {
        this.nome = nome;
        this.valornaCarteira = valornaCarteira;
        this.carrinho = new Carrinho(quanidadoCarrinho, precoUnitario);
    }

    public double getValornaCarteira() {
        return valornaCarteira;
    }

    public void printComprador(){
        System.out.println("Cliente: " + nome);
        System.out.println("Valor para investir R$ %2.f\n" + valornaCarteira);
        carrinho.printCarrinho();
        System.out.println("----------------------------");

    }

    public static void main(String[] args) {
        int totalInclusao = 6;
        int totalRemocao  = 8;

       Comprador maria = new Comprador("Maria", 10, 5,15.0);
       maria.printComprador();

       try {

           for (int i = 0; i < totalInclusao; i++);
           maria.carrinho.inserir();
           System.out.println("Produtos no carrinho depois da inclusão: " + maria.carrinho.getQuantidade());

           for (int i = 0; i < totalRemocao; i++);
           maria.carrinho.remover();
           System.out.println("Produtos no carrinho após a excusão: " + maria.carrinho.getQuantidade());
       }catch (AssertionError e){
           e.printStackTrace();
           System.out.println("Erro" + e.getMessage());
       }
    }

}
