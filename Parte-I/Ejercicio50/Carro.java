package Ejercicio50;

/*
 * Error:
 *
 * public class Carro {
 *     String marca = "Mazda";
 *
 *     public void acelerar() {
 *         System.out.println("El carro esta acelerando");
 *     }
 *
 *     public static void main(String[] args) {
 *         Carro.acelerar();
 *     }
 * }
 *
 * Error del compilador:
 *
 * error: non-static method acelerar() cannot be referenced from a static context
 *         Carro.acelerar();
 *              ^
 *
 * Explicacion: acelerar() es un metodo de INSTANCIA: fue pensado para
 * ejecutarse sobre un objeto real (por eso puede usar datos propios como
 * "marca"). El programador escribio la clase completa pero nunca hizo
 * "new Carro()", y luego intento llamar Carro.acelerar() como si el
 * metodo perteneciera a la clase misma (como si fuera estatico). Como
 * nunca se construyo ningun objeto, no hay sobre que ejecutar el metodo,
 * y el compilador lo rechaza.
 *
 * Correcion:
 * (se crea el objeto con "new" y se llama el metodo sobre esa referencia)
 */

public class Carro {
    String marca = "Mazda";

    public void acelerar() {
        System.out.println("El carro esta acelerando");
    }

    public static void main(String[] args) {
        Carro miCarro = new Carro();
        miCarro.acelerar();
    }
}
