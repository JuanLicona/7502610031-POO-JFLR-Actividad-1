package Ejercicio52;

public class FacturaSimple {

    int numero;
    String cliente;
    double valor;


    public void Descuento(double porcentaje) {
        porcentaje = 10;
        valor = valor - valor * porcentaje / 100;
        System.out.println("El valor de la factura es: " + valor);
    }
    public void mostrarFactura() {
        System.out.println("Numero de factura: " + numero +  " Cliente: " + cliente + " " + " Valor: " + valor);

    }
    public static void main(String[] args) {
        FacturaSimple f1 = new FacturaSimple();
        f1.numero = 1;
        f1.cliente = "Juan Licona";
        f1.valor = 1000;
        f1.mostrarFactura();
        f1.Descuento(10);
    }
}
