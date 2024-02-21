package PACObjet;

import sample.expectative.Estudiante;
import sample.expectative.Ingeniero;
import sample.expectative.Persona;

import javax.lang.model.util.ElementScanner6;
import java.io.*;

public class IOJavaObjects {
    public static void main(String[] args) {
        try {
            //Persona[] personas = new Persona[6];

            Estudiante estudiante = new Estudiante();

            estudiante.setNombreCompleto("Dinana Rojas");
            estudiante.setEdad(34);
            estudiante.setGenero("Femenino");
            estudiante.setUniversidad("Mayor de San Simon");
            System.out.println(estudiante);


            //Lode webb
            String directory = "data/deep/";
            File fileEstudiante = new File(directory+"estudiante.obj");
/*

           File dataDir = new File(directory);
            if(!new File(directory).isDirectory()){
                //crea carpeta
                dataDir.mkdir();
            }
            System.out.println(fileEstudiante.getAbsolutePath());
            //referenciar obj
            //guardar
          FileOutputStream outputStream = new FileOutputStream(fileEstudiante);
            ObjectOutputStream output = new ObjectOutputStream(outputStream);

            //crea objeto
            output.writeObject(estudiante);
            String cadena1 = "Hola Mundo!";
            String cadena2 = "Clase Java";
            output.writeInt(cadena1.length());
            output.writeChars("Hola mundo!");
            output.writeInt(cadena2.length());
            output.writeChars("Clase Java");

            //guarda objeto con 1k
            output.close();
            outputStream.close();
*/
            if(fileEstudiante.exists()){
                FileInputStream inputStream = new FileInputStream(fileEstudiante);
                ObjectInputStream input = new ObjectInputStream(inputStream);

                Estudiante estudiante1 =(Estudiante) input.readObject();
                int lenfthC1 = input.readInt();
                byte[] byteSrt = new byte[lenfthC1*2];
                input.read(byteSrt);
                String Srt1 = new String((byteSrt));



                int lenfthC2 = input.readInt();
                byte[] byteSrt2 = new byte[lenfthC2*2];
                input.read(byteSrt2);
                String srt2 = new String((byteSrt2));

                System.out.println(estudiante1);
                System.out.println(Srt1);
                System.out.println(srt2);

                input.close();
                inputStream.close();

            }else{
                System.out.println("El archivo: "+fileEstudiante.getAbsolutePath()+" no existe");
            }



        }catch (Exception e){
            System.out.println(e);
        }


      /*  Ingeniero ingeniero = new Ingeniero();

        ingeniero.setNombreCompleto("Josepo Rojas");
        ingeniero.setEdad(22);
        ingeniero.setGenero("Masculino");
        ingeniero.setTitularidad("Licenciado");
        ingeniero.setBranch("Redes");*/
    }
}
