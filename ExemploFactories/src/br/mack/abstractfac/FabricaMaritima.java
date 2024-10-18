package br.mack.abstractfac;

public class FabricaMaritima implements FabricaAbstrata {

    @Override
    public Transporte criarTransporte() {
        return new Navio();
    }

    @Override
    public Embalagem criarEmbalagem() {
        return new Container();
    }
}
