package org.danielorozco.parcial.form.elementos;

import org.danielorozco.parcial.form.elementos.Canino;

public class Lobo extends Canino {
    private Integer numCamada;
    private String especieLobo;

    public Lobo() {

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

    public Lobo(Integer numCamada) {
        this.numCamada = numCamada;
    }

    public Integer getNumCamada() {
        return numCamada;
    }

    public void setNumCamada(Integer numCamada) {
        this.numCamada = numCamada;
    }

    public Lobo(String especieLobo) {
        this.especieLobo = especieLobo;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    public void setEspecieLobo(String especieLobo) {
        this.especieLobo = especieLobo;
    }
}
