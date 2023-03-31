/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *Esta clase representa una persona dentro del sistema
 * @author Iman Bonilla,Fabricio Franco
 */
public class Persona {
    
    private String nombre;
    private String DNI;
    private double peso;
    
    public String getNombre(){
    return this.nombre;
    }
    
    /**
     * Esta funcion permite encapsular el nombre de la persona
     * @param nombre  Este es el valor del nuevo nombre
     */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Persona(String nombre, String DNI, double peso) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.peso = peso;
    }
    
    
    
    
}
