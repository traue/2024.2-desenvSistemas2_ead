package br.mack.aula;

public class Endereco {

    private String logradouro;
    private int numero;
    private String complemento;
    private  String bairro;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;

    public Endereco() {
    }
    public Endereco(java.lang.String logradouro, int numero, java.lang.String complemento, java.lang.String bairro, java.lang.String cidade, java.lang.String estado, java.lang.String pais, java.lang.String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
    }

    public java.lang.String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(java.lang.String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public java.lang.String getComplemento() {
        return complemento;
    }

    public void setComplemento(java.lang.String complemento) {
        this.complemento = complemento;
    }

    public java.lang.String getBairro() {
        return bairro;
    }

    public void setBairro(java.lang.String bairro) {
        this.bairro = bairro;
    }

    public java.lang.String getCidade() {
        return cidade;
    }

    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }

    public java.lang.String getEstado() {
        return estado;
    }

    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }

    public java.lang.String getPais() {
        return pais;
    }

    public void setPais(java.lang.String pais) {
        this.pais = pais;
    }

    public java.lang.String getCep() {
        return cep;
    }

    public void setCep(java.lang.String cep) {
        this.cep = cep;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Endereco{" +
                "logradouro=" + logradouro +
                ", numero=" + numero +
                ", complemento=" + complemento +
                ", bairro=" + bairro +
                ", cidade=" + cidade +
                ", estado=" + estado +
                ", pais=" + pais +
                ", cep=" + cep +
                '}';
    }
}
