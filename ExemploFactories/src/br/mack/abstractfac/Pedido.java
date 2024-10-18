package br.mack.abstractfac;

public class Pedido {

    private Transporte transporte;
    private Embalagem embalagem;

    public Pedido(FabricaAbstrata fabrica) {
        this.transporte = fabrica.criarTransporte();
        this.embalagem = fabrica.criarEmbalagem();
    }

    public void processarPedido() {
        embalagem.Embalar();
        transporte.entregar();
    }

}
