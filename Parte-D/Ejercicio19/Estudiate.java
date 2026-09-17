package Ejercicio19;

import Ejercicio1.Estudiante;

public class Estudiate {

    int semestre;
    String nombre;
    String codigo;

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + " Codigo: " + codigo + " Semestre: " + semestre);
    }

  // Estudiante es la clase, es decir, el plano o molde abstracto que dice qué datos
  // tendrá un alumno. est1 es el objeto, es decir, la instancia real guardada
  // en la memoria del computador que puede almacenar los datos de Juan Felipe Licona.

    // un objeto vendria siendo una copia de la clase Estudiante.

    static void main(String[] args) {
        Estudiate e1 = new Estudiate();
        e1.nombre = "Felipe";
        e1.codigo = "123456789";
        e1.semestre = 1;
        e1.mostrarInfo();
    }
}
