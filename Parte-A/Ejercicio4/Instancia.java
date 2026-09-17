package Ejercicio4;

public class Instancia {

    static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.numero = "123456789";
        cuenta.titular = "Juan Licona";
        cuenta.saldo = 1000;

        cuenta.mostrarCuenta();
    }
}
