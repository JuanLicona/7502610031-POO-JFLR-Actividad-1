package Ejercicio66;

public class Universidad {
    String nombre;
    String direccion;
    String Estudiante;
    String Carrera;
    String codigo;
    String Metodologia;

    Universidad(String nombre, String direccion, String Estudiante, String Carrera, String codigo, String Metodologia){
        this.nombre = nombre;
        this.direccion = direccion;
        this.Estudiante = Estudiante;
        this.Carrera = Carrera;
        this.codigo = codigo;
        this.Metodologia = Metodologia;
    }

    Universidad(){
        nombre = "Universidad de Cartagena";
        direccion = "Sede Piedra Bolivar";
        Estudiante = "Juan Felipe Licona Romero";
        Carrera = "Ingenieria de Software";
        codigo = "7502610031";
        Metodologia = "A distancia-Semipresencial";
    }
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Estudiante: " + Estudiante);
        System.out.println("Carrera: " + Carrera);
        System.out.println("Codigo: " + codigo);
        System.out.println("Metodologia: " + Metodologia);
    }
    public static void main(String[] args) {
        Universidad universidad = new Universidad();
        universidad.mostrarInfo();
    }

}
