package br.mack.gof.adapter;

public class Principal {

    public static void main(String[] args) {

        //crio um objeto da classe "legada"
        DesenhoAntigo desenhoAntigo = new DesenhoAntigo();

        //uso o adaptador para realizar o desenho:
        Forma retangulo = new RetanguloAdapter(desenhoAntigo);
        Forma porquinho = new PorquinhoAdapter(desenhoAntigo);

        //chamando o método de desenho:
        retangulo.desenhar();
        System.out.println();
        porquinho.desenhar();
    }

}
