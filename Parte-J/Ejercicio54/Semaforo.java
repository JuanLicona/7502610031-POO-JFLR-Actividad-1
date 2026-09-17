package Ejercicio54;

import java.util.Random;

public class Semaforo {

    String  estado;

    public void cambiarEstado(){
        String[] colores = {"Verde", "Amarillo", "Rojo"};
        Random aleaatorio = new Random();
        int numeroAleatorio = aleaatorio.nextInt(3);
        estado = colores[numeroAleatorio];

        System.out.println("El semaforo se encuentra en el estado: " + estado);
        System.out.println();


    }
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        semaforo.cambiarEstado();
    }
}
