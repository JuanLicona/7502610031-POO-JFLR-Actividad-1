package Ejercicio35;

public class Lampara {

    String marca;
    boolean encendida;

    public void encender(){
        encendida = true;
        System.out.println("Lampara encendida");
    }
    public void apagar(){
        encendida = false;
        System.out.println("Lampara apagada");
    }
    public void mostrarEstado(){
        System.out.println("Lampara: " + marca + "   Encendida: " + encendida);
    }

    public static void main(String[] args) {
        Lampara lampara = new Lampara();
        lampara.marca = "Philips";

        lampara.mostrarEstado();

        lampara.encender();
        lampara.mostrarEstado();

        lampara.apagar();
        lampara.mostrarEstado();
    }
}
