/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisge;




import static conexion.Conectar.resultado;
import static conexion.Conectar.sentencia;
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
                crso.setId(resultado.getString("id_curso"));
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
                alm.setId(resultado.getString("id_turno"));
                alm.setDescripcion(resultado.getString("descripcion"));
              Items.add(alm);
            
        }
        } catch (Exception e) {
        }
      return Items;
   }
    public ArrayList<Grupo> Grupos(){
    ArrayList<Grupo> grupo = new ArrayList<>();
             String Q = "SELECT *  FROM grupos";
        try {
    
            resultado = sentencia.executeQuery(Q);
            
        } catch (Exception e) {
            System.out.println(e);
        }try {
            while (resultado.next()) {            
                Grupo alm = new Grupo();
                alm.setId(resultado.getInt("id_grupo"));
                alm.setGrupo(resultado.getString("grupo"));
              grupo.add(alm);
            
        }
        } catch (Exception e) {
        }
      return grupo;
   }
        public ArrayList<Semestre> Semestre(){
    ArrayList<Semestre> semestre = new ArrayList<>();
             String Q = "SELECT *  FROM semestre";
        try {
    
            resultado = sentencia.executeQuery(Q);
            
        } catch (Exception e) {
            System.out.println(e);
        }try {
            while (resultado.next()) {            
                Semestre alm = new Semestre();
                alm.setId(resultado.getInt("id_semestre"));
                alm.setDescripcion(resultado.getString("descripcion"));
              semestre.add(alm);
            
        }
        } catch (Exception e) {
        }
      return semestre;
   }
            public ArrayList<Docente> Docente(){
    ArrayList<Docente> docente = new ArrayList<>();
             String Q = "SELECT id_docente, nombre  FROM docente";
        try {
    
            resultado = sentencia.executeQuery(Q);
            
        } catch (Exception e) {
            System.out.println(e);
        }try {
            while (resultado.next()) {            
               Docente alm = new Docente();
                alm.setId(resultado.getInt("id_docente"));
                alm.setNombre(resultado.getString("nombre"));
              docente.add(alm);
            
        }
        } catch (Exception e) {
        }
      return docente;
   }
}
