package org.danielorozco.parcial.form.elementos;

abstract public class Mamifero {

    protected String habitat;
    protected float altura;
    protected float largo;
    protected float peso;
    protected String nombreCientifico;

    public Mamifero() {
    }

    public Mamifero(String habitat) {
        this();
        this.habitat = habitat;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    abstract public String comer();
    abstract public String dormir();
    abstract public String correr();
    abstract public String comunicarse();
}
