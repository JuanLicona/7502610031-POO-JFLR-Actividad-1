package Ejercicio15;

public class Producto {

    public String nombre;
    public double precio;
    public int stock;

    public void mostrarProducto() {
        System.out.println(nombre + "   $" + precio + "  Stock: " + stock);
    }

    public void vender(int cantidad) {
        stock -= cantidad;
    }

    static void main(String[] args) {
        Producto p1 = new Producto();
        p1.nombre = "Laptop";
        p1.precio = 1000;
        p1.stock = 10;

        p1.vender(5);
        p1.mostrarProducto();
    }
}
