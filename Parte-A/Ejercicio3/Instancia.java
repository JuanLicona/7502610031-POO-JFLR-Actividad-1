package Ejercicio3;

public class Instancia {

    public static void main(String[] args) {

        Producto producto = new Producto();
        producto.nombre = "Monitor 20 pulgadas";
        producto.precio = 500;
        producto.stock = 2;

        producto.mostrarProducto();
    }
}
