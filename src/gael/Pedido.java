package gael;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Pedido {
    private String nome;
    private Boolean pronto;
    private Boolean entregue;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getPronto() {
        return pronto;
    }

    public void setPronto(Boolean pronto) {
        this.pronto = pronto;
    }

    public Boolean getEntregue() {
        return entregue;
    }

    public void setEntregue(Boolean entregue) {
        this.entregue = entregue;
    }
}
