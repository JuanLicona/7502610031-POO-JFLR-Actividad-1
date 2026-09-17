package Ejercicio29;

public class Estudiante {

    String nombre;
    String codigo;
    int semestre;


    public Estudiante() {

    }
    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    public Estudiante(String nombre, String codigo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }
}
