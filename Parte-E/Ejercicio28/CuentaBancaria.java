package Ejercicio28;

public class CuentaBancaria {
    String numero;
    String titular;
    double saldo;

    public CuentaBancaria(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    CuentaBancaria C1 = new CuentaBancaria("123456789","Juan Licona",1000);
CuentaBancaria C2 = new CuentaBancaria("987654321","Felipe Romero",2000);
CuentaBancaria C3 = new CuentaBancaria("456789012","Maria Garcia",3000);
}
