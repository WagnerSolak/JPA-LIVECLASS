package com.algaworks.sistemausuarios.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import java.util.Objects;
//@Entity
public class Configuracao {

    @Id
    private Integer id;

    @MapsId
    @OneToOne
    private Usuario usuario;

    private boolean receberNotificacoes;

    private boolean encerrarSessaoAutomaticamente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isReceberNotificacoes() {
        return receberNotificacoes;
    }

    public boolean isEncerrarSessaoAutomaticamente() {
        return encerrarSessaoAutomaticamente;
    }

    public void setEncerrarSessaoAutomaticamente(boolean encerrarSessaoAutomaticamente) {
        this.encerrarSessaoAutomaticamente = encerrarSessaoAutomaticamente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setReceberNotificacoes(boolean receberNotificacoes) {
        this.receberNotificacoes = receberNotificacoes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Configuracao that = (Configuracao) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
