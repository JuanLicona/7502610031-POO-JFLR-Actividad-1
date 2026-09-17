package Ejercicio18;

public class Mascota {
    public String nombre;
    public String especie;
    public int edad;

    public void mostrarMascota() {
        System.out.println(nombre + " (" + especie + ")   Edad: " + edad);
    }
    public void CumplirAños(){
        edad ++;
    }


    static void main(String[] args) {
        Mascota m1 = new Mascota();
        m1.nombre = "Connor";
        m1.especie = "Perro";
        m1.edad = 3;

m1.CumplirAños();
        m1.mostrarMascota();
    }

}
