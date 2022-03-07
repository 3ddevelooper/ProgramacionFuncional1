/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package Util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public class Util {
    List<String> fotoLista = new ArrayList();

    public List<String> leerArchivo(String archivo) {
        try (
                BufferedReader br = new BufferedReader(new FileReader(archivo));) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] dataSplit = linea.split(" ");
                fotoLista.addAll(Arrays.asList(dataSplit));

            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e);

        }
        return fotoLista;
    }
}
