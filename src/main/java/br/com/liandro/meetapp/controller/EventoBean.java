package br.com.liandro.meetapp.controller;

import br.com.liandro.meetapp.model.Evento;
import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
@Getter
@Setter
public class EventoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private Evento evento;

    private List<Evento> eventos = new ArrayList<>();

    public String adicionarEvento() {
        eventos.add(evento);
        System.out.println("Evento " + evento.getNome() + " cadastrado com sucesso!");
        limparTela();
        return "";
    }

    public void limparTela() {
        this.evento = new Evento();
    }
}
