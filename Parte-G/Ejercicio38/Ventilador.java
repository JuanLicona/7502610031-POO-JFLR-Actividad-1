package Ejercicio38;

public class Ventilador {

    String marca;
    int velocidad;
    boolean encendido;

    public void encender() {
        encendido = true;
        System.out.println("Ventilador encendido");
    }

    public void apagar() {
        encendido = false;
        velocidad = 0;
        System.out.println("Ventilador apagado");
    }

    public void subirVelocidad() {
        if (encendido) {
            velocidad++;
            System.out.println("Ventilador subiendo velocidad: " + velocidad);
        } else {
            System.out.println("El ventilador esta apagado");
        }
    }

    public void mostrarEstado() {
        System.out.println("Ventilador: " + marca + "   Encendido: " + encendido + "   Velocidad: " + velocidad);
    }

    public static void main(String[] args) {
        Ventilador ventilador = new Ventilador();
        ventilador.marca = "Samurai";

        ventilador.mostrarEstado();

        ventilador.subirVelocidad();

        ventilador.encender();
        ventilador.subirVelocidad();
        ventilador.subirVelocidad();
        ventilador.mostrarEstado();

        ventilador.apagar();
        ventilador.mostrarEstado();
    }
}
