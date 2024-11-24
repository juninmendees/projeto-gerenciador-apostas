package br.com.gerenciadorApostas.gerenciadorApostas.model;

import java.io.Serializable;
import java.util.Date;

public class Aposta implements Serializable {

    private Long idBilhete;
    private Double odd;
    private Double valor;
    private Boolean processada;
    private Boolean vencida;
    private Date data;
    private Double valorRecebido;

    public Aposta() {}

    public Aposta(Long idBilhete, Double odd, Double valor, Boolean processada, Boolean vencida,
                  Date data, Double valorRecebido) {
        this.idBilhete = idBilhete;
        this.odd = odd;
        this.valor = valor;
        this.processada = processada;
        this.vencida = vencida;
        this.data = data;
        this.valorRecebido = valorRecebido;
    }

    public Long getIdBilhete() {
        return idBilhete;
    }

    public Double getOdd() {
        return odd;
    }

    public Double getValor() {
        return valor;
    }

    public Boolean getProcessada() {
        return processada;
    }

    public Boolean getVencida() {
        return vencida;
    }

    public Date getData() {
        return data;
    }

    public Double getValorRecebido() {
        return valorRecebido;
    }

    public void setIdBilhete(Long idBilhete) {
        this.idBilhete = idBilhete;
    }

    public void setOdd(Double odd) {
        this.odd = odd;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setProcessada(Boolean processada) {
        this.processada = processada;
    }

    public void setVencida(Boolean vencida) {
        this.vencida = vencida;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setValorRecebido(Double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }
}
