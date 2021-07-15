package Semana3;

/**
 * Nombre del programa: 
 * Descripcion: Calcule la nota final de un estudiante para un curso de fundamentos de programación.
La rúbrica de evaluación del curso determina que hay solamente tres exámenes y que
la nota del curso se calcula por medio de un promedio simple (la suma de las notas de
los tres exámenes dividido entre tres). El estudiante aprueba si el promedio es igual o
mayor a 70.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ej8w3 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ 

        double notaFinal;
        String resultado;
        double examenUno;
        double examenDos;
        double examenTres;

        escribir.println("Digite la nota del primer examen:");
        examenUno = Double.parseDouble(leer.readLine());
        
        escribir.println("Digite la nota del segundo examen:");
        examenDos = Double.parseDouble(leer.readLine());

        escribir.println("Digite la nota del tercer examen");
        examenTres = Double.parseDouble(leer.readLine());

        notaFinal = (examenUno + examenDos + examenTres) / 3;
        
        if (notaFinal>=70){
            resultado = "el estudiante ha aprobado";
        } else {
            resultado = "el estudiante no ha aprobado";
        }
        
        escribir.println("El promedio es de: " + notaFinal + ", por lo tanto, " + resultado);
    }
}