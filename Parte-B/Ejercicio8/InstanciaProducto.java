package Ejercicio8;

import Ejercicio3.Producto;

public class InstanciaProducto {

    static void main(String[] args) {

        Producto p1 = new Producto();
            p1.nombre = "Laptop";
            p1.precio = 1000;
            p1.stock = 10;

            p1.mostrarProducto();

        Producto p2 = new Producto();
        p2.nombre = "Celular";
        p2.precio = 500;
        p2.stock = 5;

        p2.mostrarProducto();

        Producto p3 = new Producto();

            p3.nombre = "Tablet";
            p3.precio = 200;
            p3.stock = 15;

            p3.mostrarProducto();
    }
}
