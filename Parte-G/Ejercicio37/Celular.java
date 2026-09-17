package Ejercicio37;

public class Celular {

    String marca;
    String modelo;
    boolean prendido;

    public void prender() {
        prendido = true;
        System.out.println("Celular prendido");
    }

    public void apagar() {
        prendido = false;
        System.out.println("Celular apagado");
    }

    public void cargarBateria() {
        System.out.println("Bateria cargada");
    }

    public void mostrarEstado() {
        System.out.println("Celular: " + marca + " " + modelo + "   Prendido: " + prendido);
    }

    public static void main(String[] args) {
        Celular celular = new Celular();
        celular.marca = "Samsung";
        celular.modelo = "Galaxy S23";

        celular.mostrarEstado();

        celular.prender();
        celular.mostrarEstado();

        celular.cargarBateria();

        celular.apagar();
        celular.mostrarEstado();
    }
}
