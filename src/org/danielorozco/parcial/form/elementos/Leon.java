package org.danielorozco.parcial.form.elementos;

import org.danielorozco.parcial.form.elementos.Felino;

public class Leon extends Felino {
    private Integer numManada;
    private float potenciaRugidoDecibel;

    public Leon() {

    }

    @Override
    public String comer() {
        return null;
    }

    @Override
    public String dormir() {
        return null;
    }

    @Override
    public String correr() {
        return null;
    }

    @Override
    public String comunicarse() {
        return null;
    }

    public Leon(Integer numManada) {
        this.numManada = numManada;
    }
    public Integer getNumManada() {
        return numManada;
    }

    public void setNumManada(Integer numManada) {
        this.numManada = numManada;
    }

    public Leon(float potenciaRugidoDecibel) {
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    public void setPotenciaRugidoDecibel(float potenciaRugidoDecibel) {
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }
}
