package Ejercicio48;

/*
 * Error:
 *
 * public class CuentaBancaria {
 *     double saldo;
 *
 *     public void depositar() {
 *         double monto = 100;
 *         saldo = saldo + monto;
 *     }
 *
 *     public void mostrarInfo() {
 *         System.out.println("Ultimo monto depositado: " + monto);
 *         System.out.println("Saldo actual: " + saldo);
 *     }
 * }
 *
 * Error en compilacion:
 *
 * error: cannot find symbol
 *         System.out.println("Ultimo monto depositado: " + monto);
 *                                                            ^
 *   symbol:   variable monto
 *   location: class CuentaBancaria
 *
 * Explicacion: "monto" se declaro dentro de depositar(), asi que es una
 * variable LOCAL: solo existe mientras ese metodo se esta ejecutando y
 * desaparece apenas termina. El programador la trato como si fuera un
 * atributo (algo visible en toda la clase), pero mostrarInfo() no tiene
 * forma de "ver" una variable que nacio y murio dentro de otro metodo.
 *
 * Correcion:
 * (monto pasa a ser un atributo de la clase, visible en todos los metodos)
 */

public class CuentaBancaria {
    double saldo;
    double monto;

    public void depositar() {
        monto = 100;
        saldo = saldo + monto;
    }

    public void mostrarInfo() {
        System.out.println("Ultima transaccion: " + monto);
        System.out.println("Saldo actual: " + saldo);
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.depositar();
        cuenta.mostrarInfo();
    }
}
