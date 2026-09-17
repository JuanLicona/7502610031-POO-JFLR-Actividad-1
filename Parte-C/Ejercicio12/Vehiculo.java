package Ejercicio12;

public class Vehiculo {

    public String marca;
    public float modelo;
    public String color;
    public int velocidadActual;

    public void mostrarEstado() {
        System.out.println(marca + " " + modelo + " (" + color + ") a " + velocidadActual + " km/h");
    }

    public void frenar(int velocidad) {
        velocidadActual -= velocidad;
    }

    static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        v1.marca = "Ford";
        v1.modelo = 2010;
        v1.color = "Azul";
        v1.velocidadActual = 100;

        v1.frenar(10);
        v1.mostrarEstado();

    }
}
