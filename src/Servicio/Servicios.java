/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public class Servicios {
    
    String ftmin = "";
    String ftmax = "";

    public void mostrarDatos(List<String> listaDeFotos) {
        System.out.println("Cantidad de Likes por foto\n--------------------------\n"
                + mostrarListaDeFoto(cantDeLikePorFoto(listaDeFotos)) + "\n"+ftmin + "\n" + ftmax
                + "\nEl Promedio de Likes de la Aplicacion es: " + 
                String.format("%.2f", obtenerPromedioDeLikes(cantDeLikePorFoto(listaDeFotos))) + " Likes\n");
    }

    private List<Integer> cantDeLikePorFoto(List<String> listaDeFotos) {

        List<Integer> cantLikeFoto = new ArrayList();
        int numFoto = 1;
        int salida = 1;
        do {
            salida = Collections.frequency(listaDeFotos, "foto" + numFoto);
            if (salida != 0) {

                cantLikeFoto.add(Collections.frequency(listaDeFotos, "foto" + numFoto));
            }
            numFoto++;
        } while (salida != 0);

        return cantLikeFoto;
    }
    

    private int obtenerFotoConMasLike(List<Integer> cantDeLikes) {
        return cantDeLikes.stream().max(Integer::compare).get();
    }

    private int obtenerFotoConMenosLike(List<Integer> cantDeLikes) {
        return cantDeLikes.stream().min(Integer::compare).get();
    }

    private double obtenerPromedioDeLikes(List<Integer> cantDeLikes) {
        return (double) (cantDeLikes.stream().reduce(0, (a, b) -> a + b)) / cantDeLikes.size();
    }

    private String mostrarListaDeFoto(List<Integer> cantDeLikes) {
        String retorno = "";
        int numerofoto = 1;
        for (Integer likes : cantDeLikes) {
            retorno += "Foto" + (numerofoto++) + ": " + likes + " Likes\n";
            if (obtenerFotoConMenosLike(cantDeLikes) == likes) {
                ftmin = "La Foto con menos Likes es: Foto" + (numerofoto - 1) + " con " + likes + " Likes";
            }
            if (obtenerFotoConMasLike(cantDeLikes) == likes) {
                ftmax = "La Foto con mas Likes es: Foto" + (numerofoto - 1) + " con " + likes + " Likes";
            }

        }
        return retorno;
    }

    
    
}
