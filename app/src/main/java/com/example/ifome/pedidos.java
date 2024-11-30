package com.example.ifome;

public class pedidos {
    private int idpedidos;
    private int idusr;
    private String pizza;
    private String sabor;
    private boolean bebida;
    private String desc_bebida;
    private String tele;
    private String endereco;
    private String tamanho;

    public pedidos() {
    }

    public pedidos(int idusr, String pizza, String sabor, boolean bebida, String desc_bebida, String tele, String endereco, String tamanho) {
        this.idusr = idusr;
        this.pizza = pizza;
        this.sabor = sabor;
        this.bebida = bebida;
        this.desc_bebida = desc_bebida;
        this.tele = tele;
        this.endereco = endereco;
        this.tamanho = tamanho;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getDesc_bebida() {
        return desc_bebida;
    }

    public void setDesc_bebida(String desc_bebida) {
        this.desc_bebida = desc_bebida;
    }

    public boolean isBebida() {
        return bebida;
    }

    public void setBebida(boolean bebida) {
        this.bebida = bebida;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public int getIdusr() {
        return idusr;
    }

    public void setIdusr(int idusr) {
        this.idusr = idusr;
    }

    public int getId() {
        return idpedidos;
    }

    public void setId(int idpedidos) {
        this.idpedidos = idpedidos;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
