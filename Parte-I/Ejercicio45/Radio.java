package Ejercicio45;

/*
 * Error:
 *
 * public class Radio {
 *     String marca;
 *
 *     public void encender() {
 *         System.out.println("Radio encendida");
 *     }
 * }
 *
 * public void apagar() {
 *     System.out.println("Radio apagada");
 * }
 *
 * Erro en compilacion:
 *
 * error: class, interface, enum, or record expected
 * public void apagar() {
 * ^
 *
 * Explicacion: la llave "}" cerro la clase Radio. Despues de esa llave,
 * el compilador entiende que el archivo termino de describir esa clase y
 * solo espera otra declaracion de nivel superior (otra clase, interfaz,
 * etc). El metodo apagar() quedo escrito FUERA del cuerpo de la clase, y
 * en Java ningun metodo puede existir suelto: todo metodo debe estar
 * dentro de una clase. Por eso el compilador se queja pidiendo "class,
 * interface, enum, or record" justo donde encontro "public void".
 *
 * Correcion:
 * (el metodo apagar() se movio dentro de la clase, antes del cierre)
 */

public class Radio {
    String marca;

    public void encender() {
        System.out.println("Radio encendida");
    }

    public void apagar() {
        System.out.println("Radio apagada");
    }

    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.marca = "Sony";

        radio.encender();
        radio.apagar();
    }
}
