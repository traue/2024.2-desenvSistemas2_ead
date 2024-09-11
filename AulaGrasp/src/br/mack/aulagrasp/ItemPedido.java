package br.mack.aulagrasp;

public class ItemPedido {

    private String nomeItem;
    private double precoUnitario;
    private int qtd;

    public ItemPedido(String nomeItem, double precoUnitario, int qtd) {
        this.nomeItem = nomeItem;
        this.precoUnitario = precoUnitario;
        this.qtd = qtd;
    }

    public double calculaSubTotal() {
        return qtd * precoUnitario;
    }

}
