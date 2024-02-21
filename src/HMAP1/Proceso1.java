package HMAP1;

public class Proceso1 {
    private Contador contador;
    public Proceso1(Contador contador) {
        this.contador = contador;
    }
    public void sumar(){
        this.contador.setValor(this.contador.getValor()+1);
    }
}
