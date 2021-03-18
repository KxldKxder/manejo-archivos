package fes.aragon.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestArchivo {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader buff = null;
        AnalisisString prueba = null;
        try {
            System.out.println("Archivo: " + System.getProperty("user.dir"));
            File ruta = new File(System.getProperty("user.dir") + "/dato");
            fr = new FileReader(ruta);
            buff = new BufferedReader(fr);
            String cad;
            try {
                while((cad = buff.readLine()) !=null){
                    System.out.println(cad);
                    prueba = new AnalisisString(cad);
                    System.out.print(prueba.palabrasRepetidas());
                    System.out.println("-------------");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fr.close();
                buff.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
