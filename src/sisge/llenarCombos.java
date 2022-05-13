/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisge;



import conexion.Conectar;
import static conexion.Conectar.resultado;
import static conexion.Conectar.sentencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Jared
 */
public class llenarCombos {

    
      public ArrayList<Curso> Course(){
    ArrayList<Curso> curso = new ArrayList<>();
             String Q = "SELECT * FROM curso";
        try {
    
            resultado = sentencia.executeQuery(Q);
            
        } catch (Exception e) {
            System.out.println(e);
        }try {
            while (resultado.next()) {            
                Curso crso = new Curso();
                crso.setId(resultado.getInt("id_curso"));
                crso.setNombre(resultado.getString("nombre"));
                curso.add(crso);
            
        }
        } catch (Exception e) {
        }
      return curso;
   }
        
      public ArrayList<Alumno> Alumnos(){
    ArrayList<Alumno> alumno = new ArrayList<>();
             String Q = "SELECT id_alumno, nombre FROM alumno";
        try {
    
            resultado = sentencia.executeQuery(Q);
            
        } catch (Exception e) {
            System.out.println(e);
        }try {
            while (resultado.next()) {            
                Alumno alm = new Alumno();
                alm.setId(resultado.getInt("id_alumno"));
                alm.setNombre(resultado.getString("nombre"));
               alumno.add(alm);
            
        }
        } catch (Exception e) {
        }
      return alumno;
   }
      
          public ArrayList<items> Turno(){
    ArrayList<items> Items = new ArrayList<>();
             String Q = "SELECT id_turno, descripcion FROM turno";
        try {
    
            resultado = sentencia.executeQuery(Q);
            
        } catch (Exception e) {
            System.out.println(e);
        }try {
            while (resultado.next()) {            
                items alm = new items();
                alm.setId(resultado.getInt("id_turno"));
                alm.setDescripcion(resultado.getString("descripcion"));
              Items.add(alm);
            
        }
        } catch (Exception e) {
        }
      return Items;
   }
}
