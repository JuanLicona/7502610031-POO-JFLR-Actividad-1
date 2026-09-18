package Ejercicio67;

public class DiarioVivir {
    String nombre;
    String edad;
    String carrera;

    public DiarioVivir(String nombre, String edad, String carrea){
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    public void LunesCualquiera(){
        System.out.println("Lunes cualquiera");
        System.out.println("Levanto a las 4:00 am");
        System.out.println(" Voy a clases a las 6:00 am");
        System.out.println("Termino Clases a las 12:00 pm");
        System.out.println("Salgo a hacer rappi o Hago trbajos pendientes entre la 1:pm y las 5:30 ");
        System.out.println("A las 6:00 pm me voy a entrenar");
        System.out.println("A las 10:00 pm me voy a mi casa");
        System.out.println("A las 12:00-2:00 am me voy a dormir");

    }
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
    }
    public static void main(String[] args) {
        DiarioVivir diario = new DiarioVivir("Juan", "20", "Ingenieria en Sistemas");
        diario.mostrarInfo();
        diario.LunesCualquiera();
    }
}
