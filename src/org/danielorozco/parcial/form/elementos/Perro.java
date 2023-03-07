package org.danielorozco.parcial.form.elementos;

public class Perro extends Canino {
    private Integer fuerzaMordida;
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

    public Perro() {
        this.fuerzaMordida = fuerzaMordida;
    }

    public Integer getFuerzaMordida() {
        return fuerzaMordida;
    }

    public void setFuerzaMordida(Integer fuerzaMordida) {
        this.fuerzaMordida = fuerzaMordida;
    }
}
