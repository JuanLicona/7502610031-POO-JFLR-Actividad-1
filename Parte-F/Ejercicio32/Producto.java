package Ejercicio32;

public class Producto {

    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }


    public static Producto crearProductoBasico(String nombre){
        return new Producto(nombre, 0, 0);
    }

    public void mostrarProducto(){
        System.out.println(nombre + "   $" + precio + "  Stock: " + stock);
    }

    public static void main(String[] args) {

        System.out.println("Producto 1");

        Producto producto_basico=Producto.crearProductoBasico("Chocolate");
        producto_basico.mostrarProducto();

        System.out.println("Producto 2");

        Producto producto_basico2=Producto.crearProductoBasico("Bocadillo" );
        producto_basico2.mostrarProducto();
    }
}
