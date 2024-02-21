package HMAP1;

public class TimerSample {
    static boolean h1Working= false;
    static boolean h2Working= false;
    static int estado= 1;
    public static void main(String[] args){
        /*
        //definir hilo
        // misma referencia
        // Inmutable
        Procesador procesador = new Procesador();
        procesador.rename("Procesador1");
        Thread timer1 = new Thread(procesador);
        timer1.start();

        Procesador procesador2 = new Procesador();
        procesador.rename("Procesador2");
        Thread timer2 = new Thread(procesador2);
        timer2.start();
        */
        Contador contador = new Contador();
        Proceso1 proceso1 = new Proceso1(contador);
        //Proceso2 proceso2 = new Proceso2(contador);
        Thread timer1=new Thread(new Runnable() {
            @Override
            public void run() {
                while (contador.getValor() <10){
                    //System.out.println("Ejejcutando 1, stado= "+estado );
                    while (estado==1){
                        proceso1.sumar();
                        System.out.println("timer1 valor contador="+contador.getValor());
                        estado = 2;
                    }
                    try{
                        //Dormir??
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        timer1.start();

        Thread timer2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (contador.getValor()<10){
                    //System.out.println("Ejejcutando 2 stado= "+estado);
                    while (estado==2){

                        proceso1.sumar();
                        System.out.println("timer2 valor contador="+contador.getValor());
                        estado = 3;

                    }
                    try{
                        //Dormir??
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }


            }
        });
        timer2.start();

        Thread timer3 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (contador.getValor()<10){
                    //System.out.println("Ejejcutando 2 stado= "+estado);
                    while (estado==3){

                        proceso1.sumar();
                        System.out.println("timer3 valor contador="+contador.getValor());
                        estado = 1;

                    }
                    try{
                        //Dormir??
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }


            }
        });
        timer3.start();
        //Meterle uno mas
        //crear otro hilo y ahumentar el contador en 1 =(4)
    }



}
