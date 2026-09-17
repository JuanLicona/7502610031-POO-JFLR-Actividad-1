package Ejercicio49;

public class Persona {
    String nombre;

    /*
     * Error:
     *
     * class Persona {
     *     String nombre;
     * }
     *
     * public class PruebaPersona {
     *     public static void main(String[] args) {
     *         Persona p1 = new Persona();
     *         p1.nombre = "Ana";
     *
     *         Persona p2 = new Persona();
     *         p2.nombre = "Luis";
     *
     *         System.out.println(nombre);
     *     }
     * }
     *
     * Error en compilacion:
     *
     * error: cannot find symbol
     *         System.out.println(nombre);
     *                             ^
     *   symbol:   variable nombre
     *   location: class PruebaPersona
     *
     * Explicacion: "nombre" no es una variable que exista suelta dentro de
     * main; es un atributo que vive DENTRO de cada objeto Persona. p1 y p2
     * son dos objetos independientes, cada uno con su propia copia de
     * "nombre". Para leerlo hay que decir a traves de que objeto se quiere
     * acceder (p1.nombre o p2.nombre); escribirlo sin una referencia delante
     * es como preguntar "el nombre de quien?" sin dar mas contexto, y el
     * compilador no puede adivinarlo.
     *
     * Correcion:
     * (se accede al atributo a traves de la referencia del objeto correcto)
     */
    public class PruebaPersona {
        public static void main(String[] args) {
            Ejercicio49.Persona p1 = new Ejercicio49.Persona();
            p1.nombre = "Ana";

            Ejercicio49.Persona p2 = new Ejercicio49.Persona();
            p2.nombre = "Luis";

            System.out.println(p1.nombre);
            System.out.println(p2.nombre);
        }
    }

}
