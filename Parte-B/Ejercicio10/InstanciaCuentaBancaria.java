package Ejercicio10;

import Ejercicio5.CuentaBancaria;

public class InstanciaCuentaBancaria {

    static void main(String[] args) {

        CuentaBancaria c1 = new CuentaBancaria();
c1.numero = "123456789";
c1.titular = "Juan Licona";
c1.saldo = 1000;

c1.mostrarCuenta();

     CuentaBancaria c2 = new CuentaBancaria();
     c2.numero = "987654321";
     c2.titular = "Felipe Romero";
     c2.saldo = 2000;

     c2.mostrarCuenta();
    }
}
