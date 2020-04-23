package br.com.liandro.meetapp.controller;

import br.com.liandro.meetapp.model.Evento;
import lombok.Getter;
import lombok.Setter;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@Getter @Setter
public class EventoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private Evento evento;

    private List<Evento> eventos = new ArrayList<>();

    public String adicionarEvento() {
        eventos.add(evento);
        if (eventos.contains(evento)) {
            System.out.println("Evento " + evento.getNome() + " cadastrado com sucesso!");
        }
        return "";
    }
}
