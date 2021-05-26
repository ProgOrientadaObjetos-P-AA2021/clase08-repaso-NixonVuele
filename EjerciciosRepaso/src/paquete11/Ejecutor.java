/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete11;

public class Ejecutor {
    public static void main(String[] args) {
         /*
        Tareas
        1. Ejecuar la clase Ejecutor.java
        2. Verificar si la salida se corresponde con la información dada
        3. En caso que la salida sea incorrecta o exista error en el código; 
        debe revisar las clases involucradas y resolver la situación.
        4. Explicar lo realizado.
            
        */
        
        Calificacion c1 = new Calificacion(10, "Computación");
        Calificacion c2 = new Calificacion(10, "Lógica");
        Calificacion c3 = new Calificacion(10, "Literatura");
        
        Profesor profesor1 = new Profesor("Tara Hernandez", "contratado");
        Profesor profesor2 = new Profesor("Gregory Walsh", "nombramiento");
        Profesor profesor3 = new Profesor("Kevin Page", "nombramiento");
        
        c1.establecerProfesor(profesor1);
        c2.establecerProfesor(profesor2);
        c3.establecerProfesor(profesor3);
        
        Calificacion [] lista = {c1, c2, c3}; 
        
        LibretaCalificacion libreta1 = new LibretaCalificacion("Justin Powers");
        libreta1.establecerPromedio();
        libreta1.establecerPromedioCualitativo();
        System.out.println(libreta1);
        
    }
}
