package com.garciatomaschavez.apmv_fragments;

import androidx.lifecycle.ViewModel;

public class Buffer extends ViewModel {
    private String anteriorElemento = "MAIN";
    private String mensaje = "No hay mensaje";

    public String getAnteriorElemento() {
        return anteriorElemento;
    }

    public void setAnteriorElemento(String anteriorElemento) {
        this.anteriorElemento = anteriorElemento;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
