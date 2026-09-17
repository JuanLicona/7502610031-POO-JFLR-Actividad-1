package Ejercicio17;

public class Estudiante {

    public String nombre;
    public String codigo;
    public int semestre;

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + " Codigo: " + codigo + " Semestre: " + semestre);
    }

    public void CambiarSemestre(int aumento){
        semestre += aumento;
        System.out.println("Semestre actual: " + semestre);
    }

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante();
        e1.nombre = "Juan";
        e1.codigo = "123456789";
        e1.semestre = 1;

        e1.CambiarSemestre(2);
        e1.mostrarInfo();
    }


}
