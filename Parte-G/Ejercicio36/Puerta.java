package Ejercicio36;

public class Puerta {

    String material;
    boolean abierta;

    public void abrirPuerta(){
        abierta = true;
        System.out.println("Puerta abierta");
    }
    public void cerrarPuerta(){
        abierta = false;
        System.out.println("Puerta cerrada");
    }
    public void mostrarEstado(){
        System.out.println("Puerta: " + material + "   Abierta: " + abierta);
    }

    public static void main(String[] args) {
        Puerta puerta = new Puerta();
        puerta.material = "Madera";

        puerta.mostrarEstado();

        puerta.abrirPuerta();
        puerta.mostrarEstado();

        puerta.cerrarPuerta();
        puerta.mostrarEstado();
    }
}
