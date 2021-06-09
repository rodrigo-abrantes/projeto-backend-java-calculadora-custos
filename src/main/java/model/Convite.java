package model;

import java.sql.Date;

public class Convite {

    private int id;
    private Date dataEvento;
    private String cidade;
    private String estado;
    private String endereco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Convite() {
    }

    public Convite(int id, Date dataEvento, String cidade, String estado, String endereco) {
        this.id = id;
        this.dataEvento = dataEvento;
        this.cidade = cidade;
        this.estado = estado;
        this.endereco = endereco;
    }
}
