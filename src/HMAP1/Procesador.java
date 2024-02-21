package HMAP1;

public class Procesador implements Runnable {
    int conunter = 1;
    String name = "Desconocido";
    void rename(String name){
        this.name = name;
    }

    @Override
    public void run() {
        while(conunter<11){
            System.out.println(name + "=>> "+"Counter: "+conunter);
            try{
                //Dormir??
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            conunter++;
            /* Mo usar
            if(conunter == 10){
                break;
            }*/
        }

    }
}
