/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package main;

import Servicio.Servicios;
import Util.Util;

/**
 *
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public class main {

    public static void main(String[] args) {
      
        Util archivo = new Util();
        Servicios serv = new Servicios();
        serv.mostrarDatos(archivo.leerArchivo("D:\\likes.txt"));
        
    }
    
}
