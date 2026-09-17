package Ejercicio13;

public class CuentaBancaria {
    public String numero;
    public String titular;
    public double saldo;

    public void mostrarCuenta() {
        System.out.println("Cuenta: " + numero + "   Titular: " + titular + "   Saldo: $" + saldo);
    }

    public void consignar(double cantidad) {
        saldo += cantidad;
    }

    static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria();
        c1.numero = "123456789";
        c1.titular = "Juan Perez";
        c1.saldo = 1000;

        c1.consignar(500);
        c1.mostrarCuenta();
    }
}
