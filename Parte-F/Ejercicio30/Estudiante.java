package Ejercicio30;

public class Estudiante {

    String nombre;
    String codigo;
    int semestre;


    public Estudiante() {
        this.nombre = "Sin Nombre";
        this.codigo = "Sin Codigo";
        this.semestre = 1;
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


    void mostrarInfo(){
        System.out.println("Nombre: " + nombre + " Codigo: " + codigo + " Semestre: " + semestre);
    }

    public static void main(String[] args) {

        Estudiante Est1 = new Estudiante();
        Est1.mostrarInfo();
        Estudiante Est2 = new Estudiante("Felipe", "987654321");
        Est2.mostrarInfo();
        Estudiante Est3 = new Estudiante("Maria", "456789012", 2);
        Est3.mostrarInfo();
    }

}
