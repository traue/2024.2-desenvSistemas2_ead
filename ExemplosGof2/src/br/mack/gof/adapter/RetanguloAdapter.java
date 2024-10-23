package br.mack.gof.adapter;

public class RetanguloAdapter implements Forma {

    private DesenhoAntigo desenhoAntigo;

    public RetanguloAdapter(DesenhoAntigo desenhoAntigo) {
        this.desenhoAntigo = desenhoAntigo;
    }

    @Override
    public void desenhar() {
        //adaptando a chamada para o método de sistema "legado"
        desenhoAntigo.desenharRetangulo();
    }
}
