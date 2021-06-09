package model;

public class ConviteContato {
    private int id;
    private Convite convite;
    private Contato contato;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Convite getConvite() {
        return convite;
    }

    public void setConvite(Convite convite) {
        this.convite = convite;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public ConviteContato() {
    }

    public ConviteContato(int id, Convite convite, Contato contato) {
        this.id = id;
        this.convite = convite;
        this.contato = contato;
    }
}
