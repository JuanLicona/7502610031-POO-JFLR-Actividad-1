package Ejercicio47;

/*
 *Error:
 *
 * public class Perro {
 *     public void ladrar() {
 *         System.out.println("Guau guau");
 *     }
 *
 *     public static void main(String[] args) {
 *         Perro miPerro;
 *         miPerro.ladrar();
 *     }
 * }
 *
 * Error del compilador:
 *
 * error: variable miPerro might not have been initialized
 *         miPerro.ladrar();
 *         ^
 *
 * Explicacion: la linea "Perro miPerro;" solo declara un nombre de
 * referencia, todavia no crea ningun objeto Perro en memoria (para eso
 * hace falta "new Perro()"). Java no permite usar una variable local que
 * podria no tener ningun valor asignado, asi que al intentar llamar
 * miPerro.ladrar() sin haber hecho "new", el compilador bloquea el
 * programa antes de que llegue a ejecutarse.
 *
 * Correcion:
 * (se crea el objeto con "new" antes de usarlo)
 */

public class Perro {
    public void ladrar() {
        System.out.println("Guau guau");
    }

    public static void main(String[] args) {
        Perro miPerro = new Perro();
        miPerro.ladrar();
    }
}
