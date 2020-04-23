package br.com.liandro.meetapp.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private String organizacao;
    private String local;
    private String data;
    private String horario;
}
