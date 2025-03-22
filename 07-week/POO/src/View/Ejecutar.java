package View;
import Model.Estudiante;
import Model.Persona;
import Model.Profesor;

public class Ejecutar{
    public static void main (String[] Arg){
        //Mostrar data
        System.out.println("Probando escenario 1.");

        System.out.println("Clase Hija Estudiante");
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Alvaro");
        estudiante.setCorreo("alvaro@corhuila.edu.co");
        estudiante.setCodigo("2025A-12");
        estudiante.Mostrar();

        System.out.println("Clase Hija Profesor");
        Profesor profesor = new Profesor();
        profesor.setNombre("Diana");
        profesor.setCorreo("diana@corhuila.edu.co");
        profesor.setTipoContrato("tiempo completo");
        profesor.Mostrar();
    }
}