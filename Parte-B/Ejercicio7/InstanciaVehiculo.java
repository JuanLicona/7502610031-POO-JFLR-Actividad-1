package Ejercicio7;

import Ejercicio2.Vehiculo;

public class InstanciaVehiculo {
    static void main(String[] args) {


        Vehiculo v1 = new Vehiculo();
        {
            v1.marca = "Ford";
            v1.modelo = 2010;
            v1.color = "Azul";
            v1.velocidadActual = 100;

            v1.mostrarEstado();
        }

        Vehiculo v2 = new Vehiculo();
        {
            v2.marca = "Toyota";
            v2.modelo = 2018;
            v2.color = "Rojo";
            v2.velocidadActual = 120;

            v2.mostrarEstado();
        }
    }

}
