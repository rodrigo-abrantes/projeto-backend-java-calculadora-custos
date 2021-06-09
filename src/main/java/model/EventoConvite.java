package model;

public class EventoConvite {

    private int id;
    private Evento evento;
    private Convite convite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Convite getConvite() {
        return convite;
    }

    public void setConvite(Convite convite) {
        this.convite = convite;
    }

    public EventoConvite() {
    }

    public EventoConvite(int id, Evento evento, Convite convite) {
        this.id = id;
        this.evento = evento;
        this.convite = convite;
    }
}
