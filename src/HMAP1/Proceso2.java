package HMAP1;

public class Proceso2 {
    private Contador contador;
    public Proceso2(Contador contador) {
        this.contador = contador;
    }
    public void restar(){
        this.contador.setValor(this.contador.getValor() -1);
    }
}
