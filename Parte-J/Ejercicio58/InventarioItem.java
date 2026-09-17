package Ejercicio58;

public class InventarioItem {
    String nombre;
    int cantidad;
    double precioUnitario;


    public void calcularValorT(){
        precioUnitario = cantidad * precioUnitario;
        System.out.println("Valor total: $" + precioUnitario);
    }
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + " Cantidad: " + cantidad + " Precio Unitario: $" + precioUnitario);
    }
    public static void main(String[] args) {
        InventarioItem item = new InventarioItem();
        item.nombre = "Laptop";
        item.cantidad = 2;
        item.precioUnitario = 1000;
        item.mostrarInfo();
        item.calcularValorT();

    }
}
