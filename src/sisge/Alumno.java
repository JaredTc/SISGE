/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisge;

/**
 *
 * @author Jared
 */
public class Alumno {
     private int id;
     private String nombre;
    public Alumno(){
       
     }
     public Alumno(int id, String nombre){
                 this.id = id;
                 this.nombre = nombre;
             }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
    return nombre + " - " + id;
    }
    
    
}
