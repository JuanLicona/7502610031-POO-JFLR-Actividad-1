package Ejercicio71;

public class Estudiante {

    public String nombre;
     public String codigo;
     public int semestre;


     public Estudiante(String nombre, String codigo){
         this.nombre = nombre;
         this.codigo = codigo;
     }

     public void mostrarInfo(){
         System.out.println("Nombre: " + nombre + " Codigo: " + codigo + " Semestre: " + semestre);
     }

    static void main(String[] args) {

         Estudiante e1 = new Estudiante("Juan Licona", "7502610031");
         e1.mostrarInfo();
    }
}
