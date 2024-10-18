package br.mack.gof;

public class Principal {

    public static void main(String[] args) {

        CarrinhoCompras carrinhoCompras1 = CarrinhoCompras.getInstancia();
        CarrinhoCompras carrinhoCompras2 = CarrinhoCompras.getInstancia();

        carrinhoCompras1.adicionar("Notebook");
        carrinhoCompras1.adicionar("Celular");
        carrinhoCompras1.adicionar("Livro GoF");

        carrinhoCompras2.adicionar("Caixa de som");
        carrinhoCompras2.adicionar("Camiseta");
        carrinhoCompras2.adicionar("Lanterna");

        if (carrinhoCompras1 == carrinhoCompras2) {
            System.out.println("É... são iguas!");
        }

        System.out.println("Listando os itens do carrinho 1:");
        carrinhoCompras1.listarItens();


        System.out.println("Listando os itens do carrinho 2:");
        carrinhoCompras2.listarItens();
    }

}
