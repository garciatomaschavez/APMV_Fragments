package com.garciatomaschavez.apmv_fragments;

import androidx.lifecycle.ViewModel;

public class Buffer extends ViewModel {
    private String anteriorElemento = "MAIN";

    public String getAnteriorElemento() {
        return anteriorElemento;
    }

    public void setAnteriorElemento(String anteriorElemento) {
        this.anteriorElemento = anteriorElemento;
    }
}
