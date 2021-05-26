/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;



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
        //Se crean 3 objetos de tipo Calificacion, sus parametros son
        //la calificacion y la asignatura
        Calificacion c1 = new Calificacion(10, "Computación");
        Calificacion c2 = new Calificacion(10, "Lógica");
        Calificacion c3 = new Calificacion(10, "Literatura");
        //Se crean 3 objetos de tipo profesor, sus parametros son el
        //nombre y el tipo
        Profesor profesor1 = new Profesor("Tara Hernandez", "contratado");
        Profesor profesor2 = new Profesor("Gregory Walsh", "nombramiento");
        Profesor profesor3 = new Profesor("Kevin Page", "nombramiento");
        //Ojo dentor del establecerProfesor estan creando un objeto llamado p1 
        //de tipo profe, que contiene como nombre:"Connie Palmer" y que es de
        //tipo "contratado", por ende no importa la cantidad de objetos de tipo 
        //profesor que se le envie, ya que siempre el atributo profesor va a 
        //tener los valores del objeto p1, para resolver esto se cambio el 
        //establecerProfesor
        c1.establecerProfesor(profesor1);
        c2.establecerProfesor(profesor2);
        c3.establecerProfesor(profesor3);

        Calificacion[] lista = {c1, c2, c3};

        LibretaCalificacion libreta1 = new LibretaCalificacion("Justin Powers",
                lista);
        libreta1.establecerPromedio();
        libreta1.establecerPromedioCualitativo();
        //Al momento de presentar libreta 1 se modico el toString para que 
        //tambien presentara si el docente era contratado o de nombramiento 
        System.out.println(libreta1);

    }
}
