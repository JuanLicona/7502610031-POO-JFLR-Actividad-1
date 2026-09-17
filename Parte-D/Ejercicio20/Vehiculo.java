package Ejercicio20;

public class Vehiculo {
    public String marca;
    public  float modelo;
    public String color;
    public int velocidadActual;

    void mostrarEstado() {
        System.out.println(marca + " " + modelo + " (" + color + ") a " + velocidadActual + " km/h");
    }

    Vehiculo v1 = new Vehiculo();
    {
        v1.marca = "Ford";
        v1.modelo = 2010;
        v1.color = "Azul";
        v1.velocidadActual = 100;
    }
    Vehiculo v2 = new Vehiculo();
    {
        v2.marca = "Toyota";
        v2.modelo = 2018;
        v2.color = "Rojo";
        v2.velocidadActual = 120;
    }
    Vehiculo v3 = new Vehiculo();
    {
        v3.marca = "Honda";
        v3.modelo = 2015;
        v3.color = "Gris";
        v3.velocidadActual = 80;
    }

    // Los tres vienen de la misma clase o del mismo molde, pero se diferencian en
    // sus valores independientes y como estos mismo estan ubicados en la memoria.

}