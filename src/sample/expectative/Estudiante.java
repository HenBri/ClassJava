package sample.expectative;

import java.io.Serial;
import java.io.Serializable;
//armar
public class Estudiante extends Persona  {
    private String Universidad;
    private String fechaEgreso;
    private int codigo;

    public String getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(String universidad) {
        Universidad = universidad;
    }

    public String getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(String fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String toString(){
        return "Estudiante: " + getNombreCompleto();
    }
}
