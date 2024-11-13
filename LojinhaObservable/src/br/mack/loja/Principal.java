package br.mack.loja;

public class Principal {

    public static void main(String[] args) {

        //Instância da loja (que é o objeto observável)
        Loja lojinha = new Loja();

        //Instâncias de clientes (que são objetos observadores)
        Cliente c1 = new Cliente("William");
        Cliente c2 = new Cliente("João");
        Cliente c3 = new Cliente("Beatriz");

        //inscrição dos três clientes como observadores da loja
        lojinha.inscrever(c1);
        lojinha.inscrever(c2);
        lojinha.inscrever(c3);

        //chegou um produto (os observadores devem receber uma mensagem
        lojinha.produtoChegou("iPhone 16", "Você ganhou 1% off!");
        lojinha.produtoChegou("Impressora 3D", "Chegou a super impressora do momento!");

        //desinsrevendo um cliente como observador
        lojinha.desinscrever(c2);

        //novo produto chegando... o que será que vai acontecer com os observadores?
        lojinha.produtoChegou("GoPro Hero 13", "Bora comprar a GoPro nova!!");

    }

}
