package Ejercicio1;

public class Instancia {

    static void main(String[] args) {


        Estudiante estudiante = new Estudiante();
        estudiante.nombre = "Juan Licona";
        estudiante.codigo = 123456789;
        estudiante.semestre = 2;

        estudiante.MostrarInfo();
    }
}
