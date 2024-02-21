package vd7;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Libreria<T, M> {

    private List<T> elementos;
    private M material;
    public Libreria(List<T> elementos, M material){
        this.elementos = elementos;
        this.material = material;
    }
    public void setElementos(List<T> elementos){
        this.elementos =elementos;
    }
    public void setElementos2(T[] elementos){ //Esta madre es como T[] de algo
        this.elementos = Arrays.asList(elementos);
    }
    public void setElementos3(T... elementos){ //Esta madre es como T[] de algo
        this.elementos = Arrays.asList(elementos);
    }

    public List<T> getElementos(){
        return elementos;
    }

    public M getMaterial() {
        return material;
    }

    public void setMaterial(M material) {
        this.material = material;
    }
}
