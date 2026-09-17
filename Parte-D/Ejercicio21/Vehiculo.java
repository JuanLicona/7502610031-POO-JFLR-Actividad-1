package Ejercicio21;

public class Vehiculo {

    Ejercicio20.Vehiculo v1 = new Ejercicio20.Vehiculo();{

        v1.marca = "Ford";
        v1.modelo = 2010;
        v1.color = "Azul";
        v1.velocidadActual = 100;
    }
// los objetos pueden compartir los mismos valores en los atributos sin perder su identidad o sin dar error

    Ejercicio20.Vehiculo v2 = new Ejercicio20.Vehiculo();{

        v2.marca = "Ford";
        v2.modelo = 2018;
        v2.color = "Rojo";
        v2.velocidadActual = 120;
    }
}
