package Ejercicio14;

public class CuentaBancaria {

    public String numero;
    public String titular;
    public double saldo;

    void mostrarCuenta() {
        System.out.println("Cuenta: " + numero + "   Titular: " + titular + "   Saldo: $" + saldo);
    }

    void retirar(double cantidad) {
        saldo -= cantidad;
    }

    static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria();
        c1.numero = "123456789";
        c1.titular = "Juan Licona";
        c1.saldo = 1000;

        c1.retirar(500);
        c1.mostrarCuenta();
    }
}
