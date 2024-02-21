package sample.expectative;

import java.io.Serializable;

public abstract  class Persona implements Serializable {
    private String nombreCompleto;
    private int edad;
    private String genero;


    public Persona(){
        nombreCompleto = "danile";
        edad = 43;
        genero = "Masculino";
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
