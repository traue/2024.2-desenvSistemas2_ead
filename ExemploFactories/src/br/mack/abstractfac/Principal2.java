package br.mack.abstractfac;

public class Principal2 {

    public static void main(String[] args) {

        FabricaAbstrata fabricaTerrestre = new FabricaTerrestre();
        Pedido pedido1 = new Pedido(fabricaTerrestre);
        pedido1.processarPedido();

        FabricaAbstrata fabricaMaritima = new FabricaMaritima();
        Pedido pedido2 = new Pedido(fabricaMaritima);
        pedido2.processarPedido();

    }


}
