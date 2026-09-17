package Ejercicio46;

/*
 * Error:
 *
 * public class {
 *     String nombre;
 *
 *     public void mostrar() {
 *         System.out.println("Nombre: " + nombre);
 *     }
 * }
 *
 * Error en compilacion:
 *
 * error: <identifier> expected
 * public class {
 *              ^
 *
 * Explicacion: toda clase necesita un nombre (un identificador) justo
 * despues de la palabra reservada "class". El compilador esperaba leer
 * ese nombre y en su lugar encontro directamente la llave "{", asi que no
 * tiene forma de saber como se llama la clase. Ademas, en Java el nombre
 * de una clase publica debe coincidir con el nombre del archivo .java que
 * la contiene, asi que sin nombre tampoco se podria generar el .class.
 *
 * Correcion:
 * (se le puso nombre a la clase: Mascota, igual que el archivo Mascota.java)
 */

public class Mascota {
    String nombre;

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
    }

    public static void main(String[] args) {
        Mascota mascota = new Mascota();
        mascota.nombre = "Firulais";
        mascota.mostrar();
    }
}
