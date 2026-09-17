package Ejercicio61;

public class Docente {



    //qué atributos tendrá:
    /*
    nombre del docente
    asignatura que nos da
    semestre en que nos da

     */
    //qué métodos tendrá:
    /*
    dar clase
    examen
    calificaciones
     */

    //qué objetos reales podrían construirse:
    /* solo se pueden crear Docentes
    Docente d1 = new Docente();
    Docente d2 = new Docente();

     */


    String nombre;
    String asignatura;
    int semestre;

    public void darClase(){
        semestre ++;
        System.out.println("Clase dada");
        System.out.println("Asignatura: " + asignatura);

    }
    public void examen(){
        nombre = "Jhon";
        System.out.println("Examen realizado");
        System.out.println("Asignatura: " + asignatura);
        System.out.println("Semestre: " + semestre);
        System.out.println("Nombre: " + nombre);
    }
    public void Calificaiones(){
        System.out.println("Calificaciones: " + semestre);
        System.out.println("Asignatura: " + asignatura);
        System.out.println("Nombre: " + nombre);
        System.out.println("Semestre: " + semestre);
        System.out.println("Nota: " + (semestre * 10));
        System.out.println("Promedio: " + (semestre * 10) / 2);

    }

    public static void main(String[] args) {
        Docente d1 = new Docente();
        d1.nombre = "";
        d1.asignatura = "Programacion";
        d1.semestre = 1;
        d1.darClase();
        d1.examen();
        d1.Calificaiones();
    }
}
