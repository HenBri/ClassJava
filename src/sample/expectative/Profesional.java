package sample.expectative;

public abstract class Profesional extends Persona{
    private String gradoAcademico;
    private int experiencia;
    private String FechaEgreso;

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getFechaEgreso() {
        return FechaEgreso;
    }

    public void setFechaEgreso(String fechaEgreso) {
        FechaEgreso = fechaEgreso;
    }
}
