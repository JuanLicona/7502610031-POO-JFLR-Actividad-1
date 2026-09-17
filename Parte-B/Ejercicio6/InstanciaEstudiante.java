package Ejercicio6;

import Ejercicio1.Estudiante;

public class InstanciaEstudiante {

    static void main(String[] args) {
        Estudiante est1 = new Estudiante();
est1.nombre = "Juan Felipe Licona";
est1.codigo =  "7502610031";
est1.semestre = 2;

        est1.MostrarInfo();
    }
}
