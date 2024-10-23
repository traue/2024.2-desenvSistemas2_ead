package br.mack.gof.adapter;

public class PorquinhoAdapter implements Forma{

    private DesenhoAntigo desenhoAntigo;

    public PorquinhoAdapter(DesenhoAntigo desenhoAntigo) {
        this.desenhoAntigo = desenhoAntigo;
    }

    @Override
    public void desenhar() {
        desenhoAntigo.desenharPorquinho();
    }
}
