package org.danielorozco.parcial.form.elementos;

public class Tigre extends Felino {
    private String especieTigre;
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

    public Tigre() {
        this.especieTigre = especieTigre;
    }

    public void setEspecieTigre(String especieTigre) {
        this.especieTigre = especieTigre;
    }
}
