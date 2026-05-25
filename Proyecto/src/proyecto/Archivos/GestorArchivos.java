/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.Archivos;

import proyecto.modelo.OrdenDeTrabajo;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author USER
 */
public class GestorArchivos {
    
    private static final String RUTA_ARCHIVO = "historial_ordenes.txt";
    // Método para guardar una orden en el .txt
    public void guardarOrden(OrdenDeTrabajo orden) {
        //El true en FileWriter indica que el texto nuevo se agrega al final sin borrar lo anterior
        try (FileWriter archivo = new FileWriter(RUTA_ARCHIVO, true);
            PrintWriter escritor = new PrintWriter(archivo)) {
            escritor.println("=====================================");
            escritor.println(orden.generarResumen());
            escritor.println("=====================================");           
            System.out.println("Orden guardada exitosamente en " + RUTA_ARCHIVO);
        } catch (IOException e) {
            System.out.println("Error al guardar la orden en el archivo: " + e.getMessage());
        }
    }
    //Método para leer todo el historial
    public String leerHistorial() {
        StringBuilder contenido = new StringBuilder();
        try (FileReader archivo = new FileReader(RUTA_ARCHIVO);
             BufferedReader lector = new BufferedReader(archivo)) {           
            String linea;
            while ((linea = lector.readLine()) != null) {
                contenido.append(linea).append("\n");
            }            
        } catch (IOException e) {
            //Si el archivo aún no existe mostramos este mensaje
            return "El historial está vacío o aún no se ha creado el archivo.";
        }
        return contenido.toString();
    }
}
