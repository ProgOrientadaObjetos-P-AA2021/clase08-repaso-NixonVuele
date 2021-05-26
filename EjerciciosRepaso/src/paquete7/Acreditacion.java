/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete7;

/**
 *
 * @author reroes
 */
public class Acreditacion {

    private double nota;
    private String nombreMateria;
    private Profesor profesor;

    public Acreditacion(double n, String nombre) {
        nota = n;
        nombreMateria = nombre;
        
    }

    public void establecerNota(double n) {
        nota = n;
    }

    public void establecerNombreMateria(String n) {
        nombreMateria = n;
    }
    
    public void establecerProfesor(Profesor n) {
        Profesor p1 = new Profesor("Connie Palmer", "contratado");
        profesor = p1;
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
