/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PromedioEstudiantes;


import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author cesar
 */
public class Estudiantes {
    private List<Estudiante> estudiantes;
    
    public Estudiantes() {
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
    public class Estudiante {
    private String nombre;
    private String apellido;
    private double calificacionMatematicas;
    private double calificacionHistoria;
    private double calificacionCiencias;
    private double promedio;
    private String estatus;

    public Estudiante(String nombre, String apellido, double calificacionMatematicas,
                      double calificacionHistoria, double calificacionCiencias,
                      double promedio, String estatus) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificacionMatematicas = calificacionMatematicas;
        this.calificacionHistoria = calificacionHistoria;
        this.calificacionCiencias = calificacionCiencias;
        this.promedio = promedio;
        this.estatus = estatus;
        
        
    }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public double getCalificacionMatematicas() {
            return calificacionMatematicas;
        }

        public void setCalificacionMatematicas(double calificacionMatematicas) {
            this.calificacionMatematicas = calificacionMatematicas;
        }

        public double getCalificacionHistoria() {
            return calificacionHistoria;
        }

        public void setCalificacionHistoria(double calificacionHistoria) {
            this.calificacionHistoria = calificacionHistoria;
        }

        public double getCalificacionCiencias() {
            return calificacionCiencias;
        }

        public void setCalificacionCiencias(double calificacionCiencias) {
            this.calificacionCiencias = calificacionCiencias;
        }

        public double getPromedio() {
            return promedio;
        }

        public void setPromedio(double promedio) {
            this.promedio = promedio;
        }

        public String getEstatus() {
            return estatus;
        }

        public void setEstatus(String estatus) {
            this.estatus = estatus;
        }
  }
}


    