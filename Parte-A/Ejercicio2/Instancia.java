package Ejercicio2;

public class Instancia {

    public static void main(String[] args) {
        Vehiculo auto = new Vehiculo();
        auto.marca = "Ford";
        auto.modelo = 2008;
        auto.color = "Rojo";
        auto.velocidadActual = 100;

        auto.mostrarEstado();
    }
}
