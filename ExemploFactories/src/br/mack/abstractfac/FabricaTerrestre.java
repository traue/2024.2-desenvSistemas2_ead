package br.mack.abstractfac;

public class FabricaTerrestre implements  FabricaAbstrata {

    @Override
    public Transporte criarTransporte() {
        return new Carro();
    }

    @Override
    public Embalagem criarEmbalagem() {
        return new Caixa();
    }
}
