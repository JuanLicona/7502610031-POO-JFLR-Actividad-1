package Ejercicio9;

import Ejercicio4.Mascota;

public class InstanciaMascota {

    static void main(String[] args) {
        Mascota m1 = new Mascota();
        m1.nombre = "Brayan";
        m1.especie = "Perro";
        m1.edad = 3;

        m1.mostrarMascota();
    }
}
