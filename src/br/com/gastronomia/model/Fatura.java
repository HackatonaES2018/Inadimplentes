package br.com.gastronomia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Fatura")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Fatura implements Serializable {

    @Column(name = "IdFatura")
    private long id;

    @Column(name = "valor")
    private double valor;

    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;

    @Column(name = "sequencia")
    private int sequencia;

    @Column(name = "status")
    private boolean status;

    public Fatura(long id, double valor, Date data, int sequencia) {
        this.id = id;
        this.valor = valor;
        this.data = data;
        this.sequencia = sequencia;
    }

    public Fatura() {
    }

    public long getId() {
        return id;
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }
}