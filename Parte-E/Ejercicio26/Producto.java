package Ejercicio26;

public class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public Producto(){

    }

    public void mostrarProducto() {
        System.out.println(nombre + "   $" + precio + "  Stock: " + stock);
    }

    static void main(String[] args) {
        Producto p1 = new Producto("Laptop", 1000, 10);
        p1.mostrarProducto();
        Producto p2 = new Producto();
        p2.mostrarProducto();
    }
}
