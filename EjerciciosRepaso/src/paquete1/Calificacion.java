/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Calificacion {

    private double nota;
    private String nombreMateria;
    private Profesor profesor;

    public Calificacion(double n, String nombre) {
        nota = n;
        nombreMateria = nombre;

    }

    public void establecerNota(double n) {
        nota = n;
    }

    public void establecerNombreMateria(String n) {
        nombreMateria = n;
    }

    /*Para que reciba los valores que el usuario le envia, el 
    atributo profesor tiene que ser profesor = n, donde n es el
    objeto de tipo Profesor que el usuario envia;
    }
     */
    public void establecerProfesor(Profesor n) {
        profesor = n;
    }

    public double obtenerNota() {
        return nota;
    }

    public String obtenerNombreMateria() {
        return nombreMateria;
    }

    public Profesor obtenerProfesor() {
        return profesor;
    }

}
