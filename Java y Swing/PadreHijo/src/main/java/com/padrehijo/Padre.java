package com.padrehijo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;


public class Padre {

    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        try {
            // INTRODUCCIÓN DE DATOS (es necesario el control de errores)
            //char opcion;

            String[] a = {"12", "2"};

            Process p = ProcesoJava.exec(Hijo.class, a);

            p.waitFor();

            
            
            mostrarResultadoBuffer(p);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Función que obtiene la salida stdout del proceso hijo
     *
     * @param p Proceso lanzado
     * @throws IOException
     */
    private static void getSalidaProceso(Process p) throws IOException {
        String line;
        InputStream is = p.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        // Se muestra la salida del proceso por pantalla
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        // Cuando finaliza se cierra el descriptor del proceso
        is.close();
    }

    public static void mostrarResultadoBuffer(Process p) {
        // Creamos el flujo de lectura con el proceso
        BufferedReader leer = new BufferedReader(new InputStreamReader(p.getInputStream()));
        ArrayList <String> a = new ArrayList<>();
        
        try {
            // Guardamos la primera línea
            String linea = leer.readLine();
            // Leemos las líneas y las mostramos por panatalla
            while (linea != null) {
                System.out.println(linea);
                linea = leer.readLine();
                a.add(linea);
            }
            
            leer.close();
            
            guardarResEnFichero(new File("res" + File.separator + "SalidaHijo2.txt"), a);
            
        } catch (IOException e) {
            // Controlamos el error por si hay error en el flujo de lectura
            System.out.println("Error en el flujo de lectura");
            // e.printStackTrace();
        }
    }
    
    public static void guardarResEnFichero(File fil, ArrayList a){
        
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter(fil));
        } catch (Exception e) {
        }
        
    }

}
